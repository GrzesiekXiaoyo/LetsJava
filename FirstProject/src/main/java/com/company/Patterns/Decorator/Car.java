package com.company.Patterns.Decorator;

public class Car {
    protected String Name;

    public Car()
    {
        this("samochod");
    }

    public Car(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
