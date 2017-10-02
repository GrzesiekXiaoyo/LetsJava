package com.company.Konstruktory;

public class ClassWithBase extends EasyClass {

    public ClassWithBase()
    {
        super("test"); // base z c#
        System.out.println("ClassWithBase()");
    }

    public ClassWithBase(String name)
    {
        //this();
        //super("test"); exception bo nie jest 1
    }
}
