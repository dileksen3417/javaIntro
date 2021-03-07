package com.company;

public class CustomerManager {
    private BaseDatabaseManager _baseDatabaseManager;

    public CustomerManager(BaseDatabaseManager baseDatabaseManager){
        _baseDatabaseManager=baseDatabaseManager;
    }
    public void getCustomers(){
        _baseDatabaseManager.getData();
    }
}
