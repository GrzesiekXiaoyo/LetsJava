package com.company.Patterns.Obserwator;

public class Internet implements IObserver {
    @Override
    public void AddNewInformation(String titleNewHurdler) {
        System.out.println("Internet add new information: "+titleNewHurdler);
    }
}
