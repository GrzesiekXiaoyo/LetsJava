package com.company.MyCollection;

import java.util.*;

public class Team {

    ArrayList<String> listOfPlayer;
    String[] tablicaStringow = new String[]{ "test", "ula", "ala"};

    Team() {
        listOfPlayer = new ArrayList<>();
        listOfPlayer.add("1");
        listOfPlayer.add("2");
        listOfPlayer.add("3");
    }

    public void SelectAllPlayers() {

        System.out.println("1. for (String name : listOfPlayer)");
        for (String name : listOfPlayer) {
            System.out.println(name);
        }

        System.out.println("1. for (String name : tablicaStringow)");
        for (String name : tablicaStringow) {
            System.out.println(name);
        }

        System.out.println("2. for (int i = 0; i < listOfPlayer.size(); i++)");
        for (int i = 0; i < listOfPlayer.size(); i++) {
            System.out.println(listOfPlayer.get(i));
        }

        System.out.println("2. for (int i = 0; i < tablicaStringow.length; i++)");
        for (int i = 0; i < tablicaStringow.length; i++) {
            System.out.println(tablicaStringow[i]);
        }

        System.out.println("3. for (int i = listOfPlayer.size() - 1; i >= 0; i--)");
        for (int i = listOfPlayer.size() - 1; i >= 0; i--) {
            System.out.println(listOfPlayer.get(i));
        }

        System.out.println("3. for (int i = tablicaStringow.length - 1; i >= 0; i--)");
        for (int i = tablicaStringow.length - 1; i >= 0; i--) {
            System.out.println(tablicaStringow[i]);
        }

        System.out.println("4. listOfPlayer.forEach(name -> System.out.println(name));");
        listOfPlayer.forEach(name -> System.out.println(name));

        System.out.println("4. tablicaStringow nie ma metody forEach");

        System.out.println("5. while (j < listOfPlayer.size())");
        int j = 0;
        while (j < listOfPlayer.size()) {
            System.out.println(listOfPlayer.get(j));
            j++;
        }

        System.out.println("5.  while (j < tablicaStringow.length)");
        j = 0;
        while (j < tablicaStringow.length) {
            System.out.println(tablicaStringow[j]);
            j++;
        }

        System.out.println("6. while (t >= 0)");
        int t = listOfPlayer.size() - 1;
        while (t >= 0) {
            System.out.println(listOfPlayer.get(t));
            t--;
        }

        System.out.println("6. while (t >= 0) dla tablicy stringow");
        int t2 = tablicaStringow.length - 1;
        while (t2 >= 0) {
            System.out.println(tablicaStringow[t2]);
            t2--;
        }
    }


}
