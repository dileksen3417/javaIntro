package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer();
        customer.id=1;
        customer.firstName="Dilek";
        customer.lastName="Atmaca";
        customer.age=25;
        customer.eMail="datmaca@gmail.com";

        //operasyon classlar için
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.List();
        employeeManager.BestEmployee();

    }
}
