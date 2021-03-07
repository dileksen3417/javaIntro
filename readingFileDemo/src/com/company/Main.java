package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = null;
        int total=0;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Dilek\\Documents\\udemy\\readingFileDemo\\src\\com\\company\\sayilar.txt"));
            //checked exception
            String line = null; //dosyalar satır satır okunur
            while((line= reader.readLine()) != null)
            { //dosyayı okuyabildiğim sürece yani dosya null olmadığı sürece oku ve line değişkeni içine at
                total += Integer.valueOf(line); //line degerini int'e çevir ve topla
            }//okuma işlemi bitince toplamı yazdıralım
            System.out.println("Toplam = " + total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) { //veya özel olsun istersem : IOException e
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
