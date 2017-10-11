package com.company.Patterns.Composite;

import java.util.ArrayList;

public class Composite implements IDog
{
	ArrayList<IDog> childs = new ArrayList<>();

	@Override
	public void Eat()
	{
		childs.forEach(child -> child.Eat());
	}

	public void Add(IDog dog)
	{
		childs.add(dog);
	}

	public void Remove(IDog dog)
	{
		childs.remove(dog);
	}
}
