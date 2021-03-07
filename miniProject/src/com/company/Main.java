package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //isPrime();

        //mukemmelSayilar();


    }

    private static void mukemmelSayilar() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int toplam = 0;

        if(number<=1){
            System.out.println("Bu sayılar değerlendirilemez.");
            return;
        }

        for(int i = 1; i<number; i++){
            if(number % i == 0){
                toplam = toplam + i;
            }
        }

        if(toplam == number){
            System.out.println(number + " mükemmel bir sayıdır.");
        }else System.out.println(number + " mükemmel bir sayı değildir.");
    }

    private static void isPrime() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true; //bayrak yarattım, asal olduğunu kabul ediyorum önce

        if(number==1){ //1 asal değildir, bunu yazmayı unutursak bug olur.
            System.out.println("Sayı asal değildir.");
            return;
                    //return keywordu ile bulunduğu kod bloğu kırılır yani program sonlanır. Yani içinde bulunduğu main {} methodu sonlanır.
        }

        if(number<1){
            System.out.println("Geçersiz bir sayı girdiniz.");
            return;
        }


        for(int i=2; i<number; i++){
            if(number % i == 0) {
                isPrime = false; //2den kendine kadar olan sayılara bölünüyorsa bayrağı indir
            }
        }

        if(isPrime==true)
            System.out.println("Bu asal bir sayıdır.");
        else
            System.out.println("Bu bir asal sayı değildir.");
    }
}
