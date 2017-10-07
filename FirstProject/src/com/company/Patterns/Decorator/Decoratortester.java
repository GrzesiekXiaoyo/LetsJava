package com.company.Patterns.Decorator;

public class Decoratortester {
    public static void Test()
    {
        Car myFirstAuto = new Car("Volvo");
        ChangeNameDecorator decorator = new  ChangeNameDecorator(myFirstAuto);
        ChangeNameWithSpaceDecorator decorator1 = new ChangeNameWithSpaceDecorator(myFirstAuto);
        GiveNameMyAuto(decorator);
        GiveNameMyAuto(decorator1);
    }

    public static void GiveNameMyAuto(CarDecorator carDecorator)
    {
        System.out.println(carDecorator.getName());
    }
}
