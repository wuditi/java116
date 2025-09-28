package com.wn.day41.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultObj {

    private Integer code;
    private String msg;
    public boolean success;
    public Object data;

    public static ResultObj Ok() {

        ResultObj utils = new ResultObj();
        utils.setCode(200);
        utils.setMsg("ok");
        utils.setSuccess(true);
        utils.setData("aaa");

        return utils;
    }


    public static ResultObj Ok(Object data) {

        ResultObj utils = new ResultObj();
        utils.setCode(200);
        utils.setMsg("ok");
        utils.setSuccess(true);
        utils.setData(data);
        return utils;
    }

    public static ResultObj failed() {

        ResultObj utils = new ResultObj();
        utils.setCode(400);
        utils.setMsg("failed");
        utils.setSuccess(false);
        return utils;
    }


    public ResultObj code(Integer code) {

        this.setCode(code);
        return this;
    }

    public ResultObj msg(String msg) {

        this.setMsg(msg);
        return this;
    }

    public ResultObj success(boolean success) {

        this.setSuccess(success);
        return this;
    }


    public ResultObj data(Object data) {

        this.setData(data);
        return this;
    }

}
