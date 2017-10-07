package com.company.Patterns.Builder;

public class Car {
    private String Wheels;
    private String Body;
    private String Seats;
    private String Engine;
    private String Tank;

    public void setWheels(String wheels) {
        Wheels = wheels;
    }

    public void setBody(String body) {
        Body = body;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public void setTank(String tank) {
        Tank = tank;
    }

    public void setSeats(String seats) {
        Seats = seats;
    }

    @Override
    public String toString() {
        return String.format("Body: %s. Engine: %s Tank: %s Seats: %s and wheels: %s",Body,Engine,Tank,Seats,Wheels);
    }
}
