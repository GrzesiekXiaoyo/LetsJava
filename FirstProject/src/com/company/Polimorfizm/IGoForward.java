package com.company.Polimorfizm;

public interface IGoForward {
    default void GoForward()
    {
        System.out.println("i am going forward");
    }
}
