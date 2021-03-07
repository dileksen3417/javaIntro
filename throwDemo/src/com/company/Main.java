package com.company;

public class Main {

    public static void main(String[] args) {
	    AccountManager accountManager = new AccountManager();
	    System.out.println("Hesaptaki tutar = " + accountManager.getBalance());

	    accountManager.deposit(100);
        System.out.println("Tutar eklendi, hesaptaki mevcut tutar = " + accountManager.getBalance());


        try {
            accountManager.withDraw(90);
        } catch (BalanceInsufficientException exception) {
            System.out.println(exception.getMessage()); //gelen mesajı yazdır demek yani:"Yeterli bakiyeniz bulunmamaktadır."
        }
        System.out.println("Tutar çıkarıldı, hesaptaki mevcut tutar = " + accountManager.getBalance());


        try {
            accountManager.withDraw(20);
        } catch (Exception exception) {
            System.out.println(exception.getMessage()); //gelen mesajı yazdır demek yani:"Yeterli bakiyeniz bulunmamaktadır."
        }
        System.out.println("Tutar çıkarıldı, hesaptaki mevcut tutar = " + accountManager.getBalance());



    }
}
