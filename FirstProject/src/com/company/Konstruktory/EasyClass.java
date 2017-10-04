package com.company.Konstruktory;

public class EasyClass {

    public String Name;

    public EasyClass() {
        this("tt");
        System.out.println("EasyClass()");
        //this("tt"); //compilation error
    }

    public EasyClass(String name) {
        Name = name;
        System.out.println("EasyClass(String name)");
    }

    public EasyClass(String name, int number, float secondNumber) {
        //Name = name;  compilation error
        this(name, number);
        System.out.println("EasyClass(String name, int number, float secondNumber)");
    }

    private EasyClass(String name, int number) {
        this();
        System.out.println("Private constructor run");
    }

}
