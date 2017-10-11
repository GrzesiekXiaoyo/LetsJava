package com.company.Patterns.Builder;

public class CarCreator {
    CarBuilder carBuilder;

    public void SetBuilder(CarBuilder carBuilder)
    {
        this.carBuilder = carBuilder;
    }

    public Car GetCar()
    {
        return carBuilder.getCar();
    }

    public void CreateCar()
    {
        carBuilder.newCar();
        carBuilder.BuildBody();
        carBuilder.BuildEngine();
        carBuilder.BuildSeats();
        carBuilder.BuildTank();
        carBuilder.BuildWheels();
    }
}
