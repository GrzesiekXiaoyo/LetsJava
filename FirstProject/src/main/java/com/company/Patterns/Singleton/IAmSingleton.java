package com.company.Patterns.Singleton;

public class IAmSingleton {
    private IAmSingleton()
    {
        System.out.println("Constructor run");
    }

    private static IAmSingleton _instance= new IAmSingleton();

    public static IAmSingleton getInstance()
    {
        return _instance;
    }

    public int i = 0;

    public synchronized void ExampleMethod()
    {

        i++;
        i--;
        System.out.println(i);
    }
}
