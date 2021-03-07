package com.company;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //createFile();
        //getFileInfo();
        readFile();
        writeFile();
        readFile();

    }

    private static void writeFile() {
        //File degil,FileWriter kullanmamız lazım. Bu da bizi zorunlu try/catche götürüyor.
        //BufferedWriter bufferedWriter = new BufferedWriter(FileWriter file = new FileWriter("C:\\Users\\Dilek\\Documents\\udemy\\files\\student.txt,true");
        //veya
        try {
            FileWriter file = new FileWriter("C:\\Users\\Dilek\\Documents\\udemy\\files\\student.txt",true);
            //file nesnesine bir true(append)ekledik. Bunu demezsek defaultu üzerine yazmaktır. Yani sadece Güney yazar dosyaya eski veriler silinir.
            //true göndererek üzerine yazma değil, sonuna ekleme moduna alıyoruz.
            BufferedWriter bufferedWriter = new BufferedWriter(file);

            bufferedWriter.newLine();//append eklediğimiz için AtmacaGüney diye dosya sonuna ekler, bunu düzeltmek için de yeni satır ekle oraya yaz deriz.
            bufferedWriter.write("Güney");
            System.out.println("Dosyaya yazıldı.");
            bufferedWriter.close(); //kapat
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void readFile() {
        //File nesnesi: bellege almadan dosya uzerınden okuma
        //bufferedReader nesnesi önce dosyayı bellege alır, işlemleri bellek üzerinden yapar.
        File file = new File("C:\\Users\\Dilek\\Documents\\udemy\\files\\student.txt");
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){//okuyabildiği(t/f) sürece devam et.
                //okudugum bu dysayı bir yere kaydetmem gerekiyor.
                String line = reader.nextLine();
                System.out.println("Okunan line : "  +line);//satır satır okuyup ekrana yazar
            }
            reader.close(); //dosyayı bellekten uçurur işi bitince ki bellekte yer kaplamasın.
        } catch (FileNotFoundException e) { //dosyayı bulamazsa...
            e.printStackTrace();
        }
    }

    private static void getFileInfo() {
        File file = new File("C:\\Users\\Dilek\\Documents\\udemy\\files\\student.txt");
        if(file.exists()) {//böyle bir dosya ilgili yolda varsa true,yoksa false döndürür.
            System.out.println("Dosya adı: " + file.getName()); //dosya adını bize verir
            System.out.println("Dosya yolu: " + file.getAbsolutePath()); //dosya yolunu bize verir
            System.out.println("Dosya okunabilir mi: " + file.canRead()); //dosyaya yazma yapılabilir mi
            System.out.println("Dosya yazılabilir mi: " + file.canWrite()); //dosya okuma yapılabilir mi
            System.out.println("Dosyanın boyutu: " + file.length()); //dosyanın boyutunu döner
        }
    }

    private static void createFile() {
        File file = new File("C:\\Users\\Dilek\\Documents\\udemy\\files\\student.txt");//isminde dosya yok,aşağıda yaratacak
        try {
            if (file.createNewFile()){ //dosya yoksa;oluşturur ve true döndürür
                System.out.println("Dosya yaratıldı.");
            }else{
                System.out.println("Dosya zaten mevcut.");
            }

        } catch (IOException e) {
            e.printStackTrace(); //hatayı ekrana yaz
        }
    }
}
