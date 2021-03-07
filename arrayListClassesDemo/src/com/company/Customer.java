package com.company;

public class Customer {
    int id;
    String firstName;
    String lastName;

    public Customer(){ //hiç değer vermeden de Customer nesnesi örneği bellekte oluşturulabilsin.

    }
    public Customer(int id,String firstName,String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        //gelen değerleri Customer nesnemdeki bu değerlere ata diyorum.
    }
}
