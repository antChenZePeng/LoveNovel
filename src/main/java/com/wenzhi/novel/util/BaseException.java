package com.wenzhi.novel.util;

import com.wenzhi.novel.hardcode.EExceptionCode;
import lombok.Getter;

/**
 * Created by heylear.cai on 2016/4/18.
 */
public class BaseException extends Exception {

    @Getter
    String errorCode;

    @Getter
    String errorMessage;

    public BaseException(){

    }

    public BaseException(String message) {
        super(message);
        this.errorCode = EExceptionCode.EErrorCode.FAIL.getCodeStr();
        this.errorMessage = message;
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = EExceptionCode.EErrorCode.FAIL.getCodeStr();
        this.errorMessage = message;
    }

    public BaseException(String errorCode, String errorMessage){
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BaseException(int errorCode, String errorMessage){
        super(errorMessage);
        this.errorCode = errorCode+"";
        this.errorMessage = errorMessage;
    }

    public BaseException(String errorCode, String errorMessage, Throwable cause){
        super(errorMessage, cause);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
