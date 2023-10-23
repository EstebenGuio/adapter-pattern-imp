package com.pgd.cjpayrollprocessor.exception;

public class NotValidName extends Exception{
    public NotValidName(){}
    public NotValidName(String msg){
        super(msg);
    }
}