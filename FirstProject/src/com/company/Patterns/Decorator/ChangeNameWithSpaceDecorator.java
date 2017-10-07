package com.company.Patterns.Decorator;

public class ChangeNameWithSpaceDecorator extends CarDecorator {
    public ChangeNameWithSpaceDecorator(Car car) {
        super(car);
    }

    @Override
    public String getName() {
        return " "+ super.getName();
    }
}
