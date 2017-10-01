package com.company.Polimorfizm;

public class PolimorfizmTester {
    public static void Test()
    {
        Cat cat = new Cat();
        Dog dog = new Dog();

        CallGiveVoice(cat);
        CallGiveVoice(dog);
    }

    private static void CallGiveVoice(IAnimal animal)
    {
        animal.GiveVoice();
    }
}
