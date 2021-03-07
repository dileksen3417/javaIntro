package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<String,String> sozluk = new HashMap<String,String>(); //int,string veya iki farklı nesne:customer,person olabilir.
        sozluk.put("book","kitap"); //put eleman eklemeye yarar, key - value şeklinde veri ekleriz.
        sozluk.put("table","masa");
        sozluk.put("pencil","kalem");

        System.out.println(sozluk); //sözlük'ü bir set yapısında yazdırır: {book=kitap, pencil=kalem, table=masa}
        System.out.println(sozluk.get("table")); //key değerini vererek get methodunu çağırırım bana bu keydeki value'u verir.

        sozluk.remove("table"); //bu key'e sahip olan value'yu siler.

        sozluk.clear(); //sozluk'u tamamen temizler.

        System.out.println(sozluk.size()); //sozluk'te kaç tane eleman varsa onu verir.

        //sozlukteki elemanları tek tek dolasma:
        for (String item : sozluk.keySet()){ //sadece key'lerin olduğu bir liste döndürür. Sıralı olarak değil karışık listeler.
            System.out.println(item);
        }

        for (String item : sozluk.values()){ //sadece value'ların olduğu bir liste döndürür.
            System.out.println(item);
        }

        //key + value şeklinde yazdırma
        for (String item: sozluk.keySet()) {
            System.out.println("Key: "+item +  " - Value: "+sozluk.get(item));
        }

    }
}
