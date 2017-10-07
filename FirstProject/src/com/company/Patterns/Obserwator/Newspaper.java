package com.company.Patterns.Obserwator;

public class Newspaper implements IObserver {
    @Override
    public void AddNewInformation(String titleNewHurdler) {
        System.out.println("Newspaper add new information: "+titleNewHurdler);
    }
}
