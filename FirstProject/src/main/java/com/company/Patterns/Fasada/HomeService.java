package com.company.Patterns.Fasada;

public class HomeService
{
	private GarageDoor garageDoor = new GarageDoor();
	private HomeDoor homeDoor = new HomeDoor();
	private HomeDoor homeDoor2 = new HomeDoor();

	public void LockAllDoor()
	{
		System.out.println("------ LOCK HOME -----");
		garageDoor.Lock();
		homeDoor.Lock();
		homeDoor2.Lock();
	}

	public void UnLockAllDoor()
	{
		System.out.println("------ UNLOCK HOME -----");
		garageDoor.UnLock();
		homeDoor.UnLock();
	}
}
