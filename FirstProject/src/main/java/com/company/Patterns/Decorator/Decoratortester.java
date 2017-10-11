package com.company.Patterns.Decorator;

public class Decoratortester {
    public static void Test()
    {
        Car myFirstAuto = new Car("Volvo");
        ChangeNameDecorator decorator = new  ChangeNameDecorator(myFirstAuto);
        ChangeNameWithSpaceDecorator decorator1 = new ChangeNameWithSpaceDecorator(myFirstAuto);
       CarDecorator stanradCar = new CarDecorator(myFirstAuto);



           GiveNameMyAuto(decorator1);

           GiveNameMyAuto(stanradCar);


        GiveNameMyAuto(decorator);

    }

    public static void GiveNameMyAuto(CarDecorator carDecorator)
    {
        System.out.println(carDecorator.getName());
    }
}
