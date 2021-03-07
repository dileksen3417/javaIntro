package com.company;

public class Main {

    public static void main(String[] args) {
        Product product=new Product();
        product.name="Laptop";
        product.id=1;
        product.description="Asus Laptop";
        product.price=5000;
        product.stockAmount=30;
        System.out.println("Code bilgisi :"+product.getCode());
        product.setCode("DLK-");
        System.out.println("Code bilgisi :"+product.getCode());


        ProductManager productManager = new ProductManager();
        productManager.add(product);

        //
        productManager.add2(1,"","",2,200);
        productManager.add2(1,"","",2,200);
        productManager.add2(1,"","",2,200);
        //add methodunda encapsulation kullanmadık, yarın oburgün buradaki bir alanın adı değişirse,
        //yeni bir alan eklenirse veya artık kullanılmadığı için silinirse bu çağrım şekli hata verir!!
        //ve bu add2 methodunu çağırdığım her yerde değiştirmek zorunda kalırım !


        //constructor
        Product product1=new Product(1);
    }
}
