package com.company;

public class Main {

    public static void main(String[] args) {
        ifBloklari();
        buyukMu(3, 5, 8);
        switchYapisi();
    }

    private static void switchYapisi() {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel geçtiniz. :)");
                break; // program bunu görünce diğer caseleri karşılaştırmaz direkt switchten çıkar.
            case 'B':
                System.out.println("Çok iyi geçtiniz.");
                break;
            case 'D':
            case 'C': //her iki case için de aynı işlemleri yapmak istiyorsak bu şekilde yazarız.
                System.out.println("Ha gayret!.");
                break;
            case 'F':
                System.out.println("Üzgünüm kaldınız. :(");
                break;
            default: //hiçbir case uymayan bir durum için yazılan kod blogudur, switch'in sonuna yazıldıysa break koymaya gerek yoktur.
                System.out.println("Geçersiz bir değer girdiniz!");
        }
    }

    private static void ifBloklari() {
        int sayi = 10;
        if (sayi < 20) {
            System.out.println(sayi + " sayisi 20den küçüktür.");
        } else if (sayi == 20) {
            System.out.println(sayi + " sayisi 20ye eşittir.");
        } else {
            System.out.println(sayi + " sayisi 20den küçüktür.");
        }
    }

    private static void buyukMu(int sayi1, int sayi2, int sayi3) {
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }

        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }

        System.out.println(enBuyuk);
    }
}
