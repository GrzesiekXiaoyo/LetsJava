package com.company.Patterns.Singleton;

public class SingletonTester {

    public static void Test()
    {
       // IAmSingleton a = new IAmSingleton(); //BK: nie mozesz bo private constructor
        IAmSingleton.getInstance().ExampleMethod();
        IAmSingleton.getInstance().ExampleMethod();
        IAmSingleton.getInstance().ExampleMethod();
        IAmSingleton.getInstance().ExampleMethod();
        IAmSingleton.getInstance().ExampleMethod();
        IAmSingleton.getInstance().ExampleMethod();
        IAmSingleton.getInstance().ExampleMethod();
    }
}
