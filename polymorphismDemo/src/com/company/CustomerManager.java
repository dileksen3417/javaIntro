package com.company;

public class CustomerManager {
    private BaseLogger _baselogger;
    public CustomerManager(BaseLogger baseLogger){
        _baselogger=baseLogger;
    }
    public void add(){
        System.out.println("Müşteri eklendi.");
        _baselogger.log("CustomerManager loglandı.");
    }
}
