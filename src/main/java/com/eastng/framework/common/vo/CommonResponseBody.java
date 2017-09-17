package com.eastng.framework.common.vo;

public class CommonResponseBody<T> {

    /**
     * 成功为00000
     */
    private String responseCode = "00000";
    
    /**
     * 异常消息
     */
    private String message;
    
    /**
     * 数据体
     */
    private T data;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    
    
}
