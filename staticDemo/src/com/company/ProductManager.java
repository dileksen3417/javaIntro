package com.company;

public class ProductManager {
    public void add(Product product){
        if(ProductValidator.isValid(product)){ //isValid static oldugu için direkt bu şekilde çağırılabilir.
            System.out.println("Eklendi.");
        }else{
            System.out.println("Eklenemedi, ürün bilgileri geçersizdir.");
        }

        ProductValidator productValidator = new ProductValidator();
        productValidator.bisey();
    }



}
