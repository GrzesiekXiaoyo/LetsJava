package com.company.Patterns.Obserwator;

public interface IObserved {
    void AddObserver(IObserver observer);
    void RemoveObserver(IObserver observer);
    void CallToObservers(String hurdler);
}
