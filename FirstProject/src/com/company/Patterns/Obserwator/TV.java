package com.company.Patterns.Obserwator;

public class TV implements IObserver {
    @Override
    public void AddNewInformation(String titleNewHurdler) {
        System.out.println("TV add new information: "+titleNewHurdler);
    }
}
