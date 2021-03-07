package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //tip güvenli arraylist
        ArrayList<String> cities = new ArrayList<String>(); //sadece string deger koyabilirim indexlere
        cities.add("Ankara");
        cities.add("İstanbul");
        cities.add("Dersim");
        cities.add("İzmir");

        cities.remove("Ankara"); //bu şekilde de eleman silebiliriz.index vererek de silebiliriz.
        for (String city:cities){
            System.out.println(city);
        }

        Collections.sort(cities); //bu da listede döner. foreach ile aynı yani.
    }
}
