package com.company.Patterns.Decorator;

public class ChangeNameDecorator extends CarDecorator {
    public ChangeNameDecorator(Car car) {
        super(car);
    }

    @Override
    public String getName() {
        return "["+super.getName()+"]";
    }
}
