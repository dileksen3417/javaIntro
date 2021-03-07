package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //Stringler bir char arraydir. Yani herbir harf char arrayindeki bir indexe denk gelir.
        String metin = "Bugün hava çok güzel.";
        System.out.println("Eleman sayisi:" + metin.length());    //eleman sayısını verir
        System.out.println("5. eleman : " + metin.charAt(4));   //belli bir yerdeki değeri bulmak

        //concat-birleştirmek
        System.out.println(metin.concat(" Yaşasın!"));   //concat ile birleştirme yapılır. Yeni bir string oluşturulur, eğer bu tutulmak isteniyorsa yeni bir değişkene atamak gerekir.
        System.out.println(metin);
        String metin2 = metin.concat(" Yaşasın!");
        System.out.println(metin2);

        //
        System.out.println(metin.startsWith("b"));  // java byk kck harf duyarlıdır!, b ile başlıyorsa true döndürür.
        System.out.println(metin.endsWith("."));   // nokta il bitiyorsa true döndür

        //
        char[] karakterler = new char[5];
        metin.getChars(0, 5, karakterler, 0);   //0'dan başlayıp 4'e kadar olan karakterleri 0. indexten itibaren karakter' arrayine ata
        System.out.println(karakterler);

        //
        System.out.println(metin.indexOf("av"));  // en soldan kaçıncı indexte av geçiyor  :7
        System.out.println(metin.lastIndexOf("a")); // en sağdan kaçıncı indexte a var :9

        //replace-değiştirmek
        //eng karakterlerin TR çevrilmesi, boşluk karakteri yerine - koymak gibi işler için kullanılır
        System.out.println(metin.replace(' ', '-'));  //yeni bir metin oluşturulur, değişiklik tutulmak isteniyorsa değişkene atılmalı
        System.out.println(metin); //yine boşluk karakterli çıktı olur.

        //substring - metnin içinden bir parçayı almak
        System.out.println(metin.substring(2)); //2. index yani g'den itibaren alır.
        System.out.println(metin.substring(2,5));  //2. indexten 5. indexe kadar(5 dahil değil) al.

        //split - ayraç - belli bir karakter dizisini dikkate alarak ayırmak
        //bir karakter verilir, o karakteri her gördüğünde durur ve tuttugunu dizi haline getirir.
        //boşluk vereyim ayraç olarak,bugün bir dizi, hava bir dizi, ... şeklinde oluşturur.
        for(String kelime : metin.split(" ")){
            System.out.println(kelime);
        }

        //lowercase, uppercase - küçük harfe / büyük harfe çevir
        //veritabanlarında arama yaparken Ü ü farkını gidermek için sıklıkla kullanılır.
        System.out.println(metin.toLowerCase());
        System.out.println(metin.toUpperCase());

        //trim - metnin başındaki ve sonundaki boşluğu atmak
        String metin3 = "     Bugün hava çok güneşli     ";
        System.out.println(metin3);
        System.out.println(metin3.trim());

    }
}
