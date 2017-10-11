package com.company.Patterns.Builder;

public class BuilderTester {
    public static  void Test()
    {
        CarCreator carCreator = new CarCreator();
        FiatBuilder fiatBuilder = new FiatBuilder();
        HondaBuilder hondaBuilder = new HondaBuilder();

        carCreator.SetBuilder(fiatBuilder);
        carCreator.CreateCar();
        Car myCar = carCreator.GetCar();

        carCreator.SetBuilder(hondaBuilder);
        carCreator.CreateCar();
        Car myCar2 = carCreator.GetCar();

        System.out.println(myCar);
        System.out.println(myCar2);
    }
}
