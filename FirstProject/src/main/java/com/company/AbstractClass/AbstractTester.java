package com.company.AbstractClass;

public class AbstractTester {
    public static void Test() {
        Cat cat = new Cat();
        Dog dog = new Dog();
        // AnimalBase animalBase = new AnimalBase(); compilation error

        GoForwardAndGiveAVoiceStupidAnimal(cat); // z klasy abstrakcyjnej -> "i am going forwad" -> miau miau
        GoForwardAndGiveAVoiceStupidAnimal(dog); // z klasy abstrakcyjnej -> "i am going forwad" -> hau hau

        cat.HowIAmRunning(); //I am running as cat
        dog.HowIAmRunning(); //I am running as dog
    }

    private static void GoForwardAndGiveAVoiceStupidAnimal(IAnimal animal) {
        animal.GoForward();
        animal.GiveAVoice();
    }
}
