package com.company.OverrideMethod;

public class OverrideTester {

    public static void Test() {
        SecondClass secondClass = new SecondClass();
        System.out.println(secondClass.LetFight());
        System.out.println(secondClass.GoFirst());
        System.out.println(SecondClass.GoAway());
        System.out.println(FirstClass.GoAway());
    }

}
