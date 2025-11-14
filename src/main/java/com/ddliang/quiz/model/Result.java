package com.ddliang.quiz.model; // 需与项目包路径一致

public class Result {
    // 状态码：1成功，0失败
    private Integer code;
    // 提示信息
    private String msg;
    // 响应数据
    private Object data;


    // 无参构造
    public Result() {}

    // 带参构造
    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    // 静态success方法：返回成功结果
    public static Result success(Object data) {
        return new Result(1, "success", data);
    }

    public static Result success(String msg) {
        return new Result(1, msg, null);
    }
    // 重载success方法：无数据时调用
    public static Result success() {
        return new Result(1, "success", null);
    }

    // 静态error方法：返回失败结果
    public static Result error(String msg) {
        return new Result(0, msg, null);
    }


    // getter/setter方法
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    // toString方法
    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}