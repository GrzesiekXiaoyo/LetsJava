package com.company.Patterns.Builder;

public class FiatBuilder extends CarBuilder {
    @Override
    public void BuildWheels() {
        car.setWheels("Best wheels");
    }

    @Override
    public void BuildBody() {
        car.setBody("Nice body");
    }

    @Override
    public void BuildSeats() {
//no seats sry
    }

    @Override
    public void BuildEngine() {
        car.setEngine("Fast");
    }

    @Override
    public void BuildTank() {
        car.setTank("1.2");
    }
}
