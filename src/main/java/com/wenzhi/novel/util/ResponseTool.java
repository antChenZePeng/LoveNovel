package com.wenzhi.novel.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.wenzhi.novel.hardcode.EReturnCode;

/**
 * 响应工具
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseTool<T> {

    private String state;//返回状态
    private String message;//返回信息
    private T data;//需要返回的数据


    public ResponseTool() {
    }

    public ResponseTool(String state) {
        this.state = state;
    }

    public ResponseTool(String state, String message) {
        this.state = state;
        this.message = message;
    }

    public ResponseTool(String state, String message, T data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }

    public ResponseTool(String state, T data) {
        this.state = state;
        this.data = data;
    }
    public String getState() {
        return state;
    }

    public ResponseTool<T> setState(String state) {
        this.state = state;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResponseTool<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResponseTool<T> setData(T data) {
        this.data = data;
        return this;
    }

    public static <T> ResponseTool<T> fail(String errorCode, String message){
        return new ResponseTool<T>(errorCode, message);
    }

    public static <T> ResponseTool<T> fail(String message){
    	return new ResponseTool<T>(EReturnCode.EErrorCode.FAIL.getCodeStr(), message);
    }
    
    public static <T> ResponseTool<T> fail(String message, T data){
    	return new ResponseTool<T>(EReturnCode.EErrorCode.FAIL.getCodeStr(), message, data);
    }
    
    public static <T> ResponseTool<T> success(String message){
    	return new ResponseTool<T>(EReturnCode.EErrorCode.OK.getCodeStr(), message);
    }
    
    public static <T> ResponseTool<T> success(T data){
    	return new ResponseTool<T>(EReturnCode.EErrorCode.OK.getCodeStr(), data);
    }
    
    public static <T> ResponseTool<T> success(String message, T data){
    	return new ResponseTool<T>(EReturnCode.EErrorCode.OK.getCodeStr(), message, data);
    }

}
