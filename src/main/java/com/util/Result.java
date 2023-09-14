package com.util;

/**
 * Created by auth
 * 2023/9/8 21:39
 */
public class Result {
    private int code;//200表示成功,300表示失败
    private String message;//提示信息
    private Object data;//成功返回数据

    public Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static Result wrap(int code, String message){
        Result result=new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    //成功返回有数据的结果集
    public static Result successObject(Object data){
        Result result=wrap(200,"成功");
        result.setData(data);
        return result;
    }

    public static Result success(){
        return wrap(200,"成功");
    }

    public static Result fail(){
        return wrap(300,"失败");
    }

    public Result() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
