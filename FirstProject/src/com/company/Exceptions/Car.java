package com.company.Exceptions;

public class Car {
    private final String Name;

    public Car(String name) throws CarException {

        if(name==null)
        {
            throw  new CarException();
        }
        Name = name;
    }

    public Car(String name, int year) throws IllegalArgumentException {
        if(name==null)
        {
            throw new IllegalArgumentException();
        }

        Name = name;
    }

    public void Go()
    {
        if(Name=="CAR")
        {
            throw new IllegalArgumentException(Name);
        }
    }

}
