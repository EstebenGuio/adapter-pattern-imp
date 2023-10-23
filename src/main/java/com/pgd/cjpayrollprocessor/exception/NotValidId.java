package com.pgd.cjpayrollprocessor.exception;

public class NotValidId extends Exception{
    public NotValidId(){}
    public NotValidId(String msg){
        super(msg);
    }
}