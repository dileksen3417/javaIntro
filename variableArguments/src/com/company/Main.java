package com.company;

public class Main {

    public static void main(String[] args) {
       System.out.println(toplam(1,5,9,10,88));
    }

    public static int toplam(int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

}
