package com.pgd.cjpayrollprocessor.exception;

public class NegativeAmount extends Exception{
    public NegativeAmount(){}
    public NegativeAmount(String msg){
        super(msg);
    }
}
