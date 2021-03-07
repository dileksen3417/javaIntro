package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ICustomerDal customerDal = new OracleCustomerDal();
        CustomerManager customerManager = new CustomerManager(customerDal);
        customerManager.add();

        //veya
        CustomerManager customerManager2 = new CustomerManager(new MySqlCustomerDal());
        customerManager2.add();

    }
}
