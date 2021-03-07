package com.company;

public class AccountManager {
    private double balance; //private diyorum çünkü dışarıdan accountmanager.balance denmesini istemiyorum!!

    public void deposit(double amount){ //deposit=para yatırmak demektir, amount=miktar
        balance += amount;  //gelen parayı hesaba ekleyelim
    }

    public void withDraw(double amount) throws BalanceInsufficientException { //withDraw=hesaptan para çekmek
        if (balance>=amount){
            balance -= amount;
        }else{
            throw new BalanceInsufficientException("Yeterli bakiyeniz bulunmamaktadır.");
        }
    }

    public double getBalance(){ // bu method Refactor->Encapsulate Fields ile eklenmiştir.
                                // Private değerin okunması için methodun mutlaka bu isim ve imza ile yazılması gerek. getBalance'!
        return balance;
    }
}
