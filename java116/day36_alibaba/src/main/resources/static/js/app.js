// 使用 jQuery 实现
const BASE_URL = ''; // 后端同源时留空，不同源时改成 http://localhost:8080

let currentEventSource = null;

function setStatus(text) {
    $("#status").text(text || "");
}

function appendOutput(text) {
    $("#output").append(text);
}

// $(function () {
//     let index = 0;
//     const slides = $(".slide");
//     const total = slides.length;
//
//     setInterval(() => {
//         slides.eq(index).removeClass("active");
//         index = (index + 1) % total;
//         slides.eq(index).addClass("active");
//     }, 4000); // 每 4 秒切换一次
// });


$("#bgUpload").on("change", function (event) {
    const file = event.target.files[0];
    if (!file) return;

    const reader = new FileReader();
    reader.onload = function (e) {
        $(".background").css("background-image", `url(${e.target.result})`);
    }
    reader.readAsDataURL(file);
});


$("#askSync").on("click", function () {
    if (currentEventSource) {
        setStatus("正在流式请求，请先停止。");
        return;
    }
    const prompt = $("#prompt").val().trim();
    if (!prompt) return;

    setStatus("请求中（同步）...");
    $("#output").text("");

    $.get(`${BASE_URL}/ali/chat`, {input: prompt})
        .done(function (res) {
            const text = res.generation || JSON.stringify(res);
            $("#output").text(text);
            setStatus("完成（同步）");
        })
        .fail(function (err) {
            setStatus("请求失败: " + err.statusText);
        });
});

$("#askStream").on("click", function () {
    if (currentEventSource) {
        setStatus("已有流式请求正在进行");
        return;
    }
    const prompt = $("#prompt").val().trim();
    if (!prompt) return;

    $("#output").text("");
    setStatus("连接中（流式）...");
    $("#stopStream").prop("disabled", false);

    const url = `${BASE_URL}/ali/stream?input=${encodeURIComponent(prompt)}`;
    currentEventSource = new EventSource(url);

    currentEventSource.onmessage = function (evt) {
        const chunk = evt.data;
        // if (chunk === "[DONE]" || chunk === "DONE") {
        //     setStatus("流式完成");
        //     currentEventSource.close();
        //     currentEventSource = null;
        //     $("#stopStream").prop("disabled", true);
        //     return;
        // }
        appendOutput(chunk);
        setStatus("接收中...");
    };

    currentEventSource.onerror = function () {
        setStatus("流式连接出错或已断开");
        currentEventSource.close();
        currentEventSource = null;
        $("#stopStream").prop("disabled", true);
    };
});

$("#stopStream").on("click", function () {
    if (currentEventSource) {
        currentEventSource.close();
        currentEventSource = null;
        setStatus("已手动停止流式");
        $("#stopStream").prop("disabled", true);
    }
});

$("#clear").on("click", function () {
    $("#output").text("");
    setStatus("");
});
