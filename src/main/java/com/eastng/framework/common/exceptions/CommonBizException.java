package com.eastng.framework.common.exceptions;

public class CommonBizException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1538205589637635848L;
    
    protected String errorCode;
    
    
    public CommonBizException(String errorCode){
        this.errorCode = errorCode;
    }
    
    public CommonBizException(String errorCode ,String errorMessage){
        super(errorMessage);
        this.errorCode = errorCode;
    }

}
