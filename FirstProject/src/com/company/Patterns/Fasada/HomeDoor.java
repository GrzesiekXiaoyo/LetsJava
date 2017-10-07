package com.company.Patterns.Fasada;

public class HomeDoor implements IDoor
{
	@Override
	public void Lock()
	{
		System.out.println("Home door are now locked.");
	}

	@Override
	public void UnLock()
	{
		System.out.println("Home door are now unlocked.");
	}
}
