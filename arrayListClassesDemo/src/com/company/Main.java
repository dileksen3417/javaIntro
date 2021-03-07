package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"Dilek","Şen")); //Javada bu şekilde değer atayabilmek için constractor açıp
                                                    //hangi değerin hangi alana karşılık geldiğini belirtmemiz lazım.
        customers.add(new Customer(2,"Güney","Şen"));
        customers.add(new Customer(3,"Kuzey","Şen"));

        for(Customer customer:customers){
            System.out.println(customer.firstName);
        }

        //eleman silmek*****************
        //Yanlış yol:
        customers.remove(new Customer(2,"Güney","Şen"));
        //dersek bu gidip 1. indexteki güneyi silmez. Cünkü new dedigim an bellekte yeni bir alan açılıyor.
        //referans tip konusu yani burada ben o referansı yollamıyorum yeni bir alan acıyorum.

        //doğru yol:
        Customer customer1 = new Customer(4,"Ayşe","Çelik");
        customers.remove(customer1);
        //dediğimde gider bu listeden Ayşeyi siler. Çünkü customer1 nesnesi bellekte Ayşe'nin referansını tutuyor.
    }
}
