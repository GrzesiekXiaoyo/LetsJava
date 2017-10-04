package com.company.MyCollection;

import java.util.*;

public class Team {

    ArrayList<String> listOfPlayer;

    Team() {
        listOfPlayer = new ArrayList<>();
        listOfPlayer.add("1");
        listOfPlayer.add("2");
        listOfPlayer.add("3");
    }

    public void SelectAllPlayers() {
        //1
        for (String name : listOfPlayer) {
            System.out.println(name);
        }

        //2
        for (int i = 0; i < listOfPlayer.size(); i++) {
            System.out.println(listOfPlayer.get(i));
        }

        //3
        for (int i = listOfPlayer.size() - 1; i >= 0; i--) {
            System.out.println(listOfPlayer.get(i));
        }

        //4
        listOfPlayer.forEach(name -> System.out.println(name));

        //5
        int j = 0;
        while (j < listOfPlayer.size()) {
            System.out.println(listOfPlayer.get(j));
            j++;
        }

        //6
        int t = listOfPlayer.size() - 1;
        while (t >= 0) {
            System.out.println(listOfPlayer.get(t));
            t--;
        }
    }


}
