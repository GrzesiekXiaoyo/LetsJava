package com.company.Konstruktory;

public class KonstruktorTester {

    public static void Test()
    {
        System.out.println("new EasyClass()");
        EasyClass test = new EasyClass(); // EasyClass(String name) -> EasyClass()
        System.out.println("new EasyClass(\"janek\");");
        EasyClass test2 = new EasyClass("janek"); // EasyClass(String name)
        System.out.println("new EasyClass(\"janek\",12, 12)");
        EasyClass test3 = new EasyClass("janek",12, 12); // EasyClass(String name) -> EasyClass() -> Private constructor-> EasyClass(string,int, float)
        System.out.println("new ClassWithBase()");
        ClassWithBase withBase = new ClassWithBase(); // (base)EasyClass(string) -> ClassWithBase()
    }

}
