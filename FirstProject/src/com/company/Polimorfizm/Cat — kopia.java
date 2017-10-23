package com.company.Polimorfizm;

public class Cat implements IAnimal,IGoForward {

    @Override
    public void GiveVoice()
    {


        System.out.println("miau miau");
    }
}
