package com.company.Patterns.Fasada;

public class GarageDoor implements  IDoor
{
	@Override
	public void Lock()
	{
		System.out.println("Garage door are now locked.");
	}

	@Override
	public void UnLock()
	{
		System.out.println("Garage door are now unlocked.");
	}
}
