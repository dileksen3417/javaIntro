package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("************FOR**************");
        for (int i = 0; i<=10; i+=2){
            System.out.println(i);
        }

        System.out.println("***********WHILE**************");
        int i = 10;
        while(i>=0){
            System.out.println(i);
            i-=2;
        }

        System.out.println("**********DO - WHILE**************");
        int j=100;
        do{
            System.out.println(j);
            j+=2;
        }while (j<10);
    }
}
