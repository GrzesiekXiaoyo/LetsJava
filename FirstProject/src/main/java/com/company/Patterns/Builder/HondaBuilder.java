package com.company.Patterns.Builder;

public class HondaBuilder extends CarBuilder {

    @Override
    public void BuildWheels() {
        car.setWheels("nice wheels");
    }

    @Override
    public void BuildBody() {
        car.setBody("very Nice body");
    }

    @Override
    public void BuildSeats() {
        car.setSeats("very Nice seats");
    }

    @Override
    public void BuildEngine() {
        car.setEngine("very Fast");
    }

    @Override
    public void BuildTank() {
        car.setTank("1.4");
    }
}
