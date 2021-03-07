package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] sayilar = new int[]{1,2,3};
        //bu dizilerdir. tanımladığımız an uzunluğu bellidir. sayilar[3]=4; diye atama yapamayız.
        //yani diziler değişken uzunlukta yapılar değildir.

        //koleksiyonlar ise arkada dizi tutar, yeni bir eleman eklediğimizde yeni bir yer acar,
        //eski elemanları buraya getirir ve yeni elemanı da sona ekler. Yani bize uzunluğu değiştirebilme imkanı sunar.
        ArrayList numbers = new ArrayList(); //uzunluk belirtilmez.
        System.out.println(numbers.size()); //arraylistin uzunluğunu verir, su an 0 eleman oldugu için 0 döndürür.

        //eleman eklemek için;
        numbers.add(1);
        numbers.add(10);
        numbers.add("Ankara"); //bizden eklemek için bir obje istediği için burada herşeyi gönderebiliriz.
        System.out.println(numbers.size()); //3 döner

        //eleman okuma
        System.out.println(numbers.get(2)); // 2. indexi ver deriz, Ankara döner.

        //eleman güncelleme
        numbers.set(0,100); //0. indexteki elemanı 100 olarak değiştir demek

        //eleman silme
        numbers.remove(0); //0. indexi sil demek
        //silme işlemi yaptığımızda o indexin kendisi uçar sadece değeri değil, yani değeri 10 olan 1. index artık 0. index olur.

        //listeyi komple silmek
        numbers.clear();

        //listeyi yazdırma
        for(Object number : numbers){ //ArrayList bizden eleman eklerken Object tipinde istediği için gezerken de Object tipiyle gezmeliyiz.
            System.out.println(number);
        }



    }
}
