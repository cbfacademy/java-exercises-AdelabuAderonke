package com.cbfacademy;

public class NullorEmptyException extends Exception{
    private final String message;
    public NullorEmptyException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage(){
        return String.join("-",super.getMessage(),this.message);
    }
}
