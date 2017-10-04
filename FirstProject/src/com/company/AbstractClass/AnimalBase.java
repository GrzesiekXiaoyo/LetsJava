package com.company.AbstractClass;

public abstract class AnimalBase implements IAnimal {
    @Override
    public void GoForward() {
        System.out.println("i am going forwad");
    }

    @Override
    public void HowIAmRunning() {
        Run();
    }

    public AnimalBase()
    {
        System.out.println("constructor AnimalBase() run");
    }

    protected abstract void Run();
}
