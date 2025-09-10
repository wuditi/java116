package com.wn.boot.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class resultObj {

    private Integer code;
    private String msg;
    public boolean success;
    public Object data;

    public static resultObj Ok() {

        resultObj utils = new resultObj();
        utils.setCode(200);
        utils.setMsg("ok");
        utils.setSuccess(true);
        utils.setData("aaa");

        return utils;
    }


    public static resultObj Ok(Object data) {

        resultObj utils = new resultObj();
        utils.setCode(200);
        utils.setMsg("ok");
        utils.setSuccess(true);
        utils.setData(data);
        return utils;
    }

    public static resultObj failed() {

        resultObj utils = new resultObj();
        utils.setCode(400);
        utils.setMsg("failed");
        utils.setSuccess(false);
        return utils;
    }


    public resultObj code(Integer code) {

        this.setCode(code);
        return this;
    }

    public resultObj msg(String msg) {

        this.setMsg(msg);
        return this;
    }

    public resultObj success(boolean success) {

        this.setSuccess(success);
        return this;
    }


    public resultObj data(Object data) {

        this.setData(data);
        return this;
    }

}
