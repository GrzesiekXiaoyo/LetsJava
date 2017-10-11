package com.company.Patterns.Decorator;

public class CarDecorator extends Car {

    protected Car _car;

    public CarDecorator(Car car) {
        _car = car;
    }

    @Override
    public String getName() {
        return _car.getName();
    }

    @Override
    public void setName(String name) {
        _car.setName(name);
    }


}
