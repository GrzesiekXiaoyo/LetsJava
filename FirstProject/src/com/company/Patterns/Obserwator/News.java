package com.company.Patterns.Obserwator;

import java.util.ArrayList;

public class News implements IObserved
{

	private ArrayList<IObserver> observers = new ArrayList<>();

	@Override
	public void AddObserver(IObserver observer)
	{
		observers.add(observer);
	}

	@Override
	public void RemoveObserver(IObserver observer)
	{
		observers.remove(observer);
	}

	@Override
	public void CallToObservers(String hurdler)
	{
		observers.forEach(observer -> observer.AddNewInformation(hurdler));
	}

}
