package com.company.Patterns.Builder;

public abstract class CarBuilder implements ICarBuilder {
    protected Car car;

    public void newCar()
    {
        car = new Car();
    }

    public Car getCar()
    {
        return car;
    }
}
