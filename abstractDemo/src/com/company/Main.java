package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseDatabaseManager baseDatabaseManager = new OracleDatabaseManager();
        CustomerManager customerManager = new CustomerManager(baseDatabaseManager);
        customerManager.getCustomers();

    }
}
