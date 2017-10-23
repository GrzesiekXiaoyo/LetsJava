package com.company.Polimorfizm;

public class Dog implements IAnimal,IGoForward {

    @Override
    public void GiveVoice() {
        System.out.println("Hau hau");
    }
}
