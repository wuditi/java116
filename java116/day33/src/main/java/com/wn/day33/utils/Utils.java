package com.wn.day33.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utils {

    private Integer code;
    private String msg;
    public boolean success;
    public Object data;

    public static Utils Ok() {

        Utils utils = new Utils();
        utils.setCode(200);
        utils.setMsg("ok");
        utils.setSuccess(true);
        utils.setData("aaa");

        return utils;
    }


    public static Utils Ok(Object data) {

        Utils utils = new Utils();
        utils.setCode(200);
        utils.setMsg("ok");
        utils.setSuccess(true);
        utils.setData(data);
        return utils;
    }

    public static Utils failed() {

        Utils utils = new Utils();
        utils.setCode(400);
        utils.setMsg("failed");
        utils.setSuccess(false);
        return utils;
    }


    public Utils code(Integer code) {

        this.setCode(code);
        return this;
    }

    public Utils msg(String msg) {

        this.setMsg(msg);
        return this;
    }

    public Utils success(boolean success) {

        this.setSuccess(success);
        return this;
    }


    public Utils data(Object data) {

        this.setData(data);
        return this;
    }

}
