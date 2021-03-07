package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int ogrenciSayisi = 12; //+ - 2 milyar --tamsayı
        long longSayi = 1000000000; //tamsayı, int 4byte iken long 8bytetır. genelde TC tutmak için ideal. Bellekte çok yer kaplar.
        byte sayi = -126; //-128 + 127
        short sayi2 = 32767; //-32768 to +32767
        double doubleSayi = 15.3; //ondalıklı
        float floatSayi = (float) -1.3; //ondalıklı, doubledan daha küçüktür.

        boolean dogruMu = true;

        char karakter = 'A';  //tek bir karakter tutar.
        String mesaj="Öğrenci sayım= ";




        System.out.println(mesaj+ogrenciSayisi);
        //System.out.println("Ogrenci sayim="+ogrenciSayisi);


    }
}
