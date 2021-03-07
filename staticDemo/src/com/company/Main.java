package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Product product = new Product();
        product.id=1;
        product.price=10;
        product.name="Mouse";

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        //bisey methodu static olmadığı için newlenerek çağırılmalıdır.

        //innerclass ornek
        DatabaseHelper.Connection.connect();
        DatabaseHelper.Crud.delete();
    }
}
