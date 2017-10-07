package com.company.Patterns.Fasada;

public class HomeService
{
	private GarageDoor garageDoor = new GarageDoor();
	private HomeDoor homeDoor = new HomeDoor();

	public void LockAllDoor()
	{
		System.out.println("------ LOCK HOME -----");
		garageDoor.Lock();
		homeDoor.Lock();
	}

	public void UnLockAllDoor()
	{
		System.out.println("------ UNLOCK HOME -----");
		garageDoor.UnLock();
		homeDoor.UnLock();
	}
}
