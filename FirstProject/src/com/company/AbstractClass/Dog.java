package com.company.AbstractClass;

public class Dog extends AnimalBase {
/*    @Override // metoda jest nie potrzebna bo jest w klasie bazowej(abstrakcyjnej aby nie powielac kodu w kazdej klasie)
    public void GoForward() {
        System.out.println("i am going forwad");
    }*/

    @Override
    public void GiveAVoice() {
        System.out.println("Hau Hau");
    }

    @Override
    protected void Run() {
        System.out.println("I am running as dog");
    }
}
