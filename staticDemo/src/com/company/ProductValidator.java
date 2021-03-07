package com.company;

public class ProductValidator {
    static{ //
        System.out.println("Static Yapıcı blok çalıştı.");
    }
    public ProductValidator(){ // class newlenince çalısır
        System.out.println("Normal Yapıcı blok çalıştı.");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){ //name alanı boş değilse true döndürür('!'var)
            return true;
        }else{
            return false;
        }
    }

    public void bisey(){
        System.out.println("Static olmayan bisey methodu çalıştı.");
    }

    public static class innerClass{
        public static void ekle(){

        }
    }
}
