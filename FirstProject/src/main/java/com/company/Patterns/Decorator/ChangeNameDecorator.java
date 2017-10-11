package com.company.Patterns.Decorator;

import com.sun.media.jfxmedia.logging.Logger;

public class ChangeNameDecorator extends CarDecorator {
    public ChangeNameDecorator(Car car) {
        super(car);
    }

    @Override
    public String getName() {
        Logger.logMsg(0, "method started");
        //System.out.println("Some1 call getName method");
        return "["+super.getName()+"]";
    }
}
