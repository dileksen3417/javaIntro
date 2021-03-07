package com.company;

public abstract class GameCalculator {
    public abstract void hesapla(); //bu classı inherit eden classlar bu methodun içini doldurmak zorunda
    public final void gameOver(){ //bu classı inherit eden bu methodu oldugu gibi kullanmak zorunda ezemez
        System.out.println("Game over..!");
    }
}
