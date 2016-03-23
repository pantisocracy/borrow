package com.borrow.exception;

public enum ErrorCodeEnum {

    /************* 系统公用 *******************************/
    /**
     * 服务端异常
     */
    SERVER_SYSERR(1001, "系统错误"),
    SERVER_NOT_PERMMIT(1002, "权限拒绝"),




    ;


    private int code;

    private String remark;

    ErrorCodeEnum(int code, String remark) {
        this.code = code;
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public int getCode() {
        return code;
    }

    public enum ErrorCodedEnum {

    }
}
