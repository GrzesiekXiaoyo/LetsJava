package com.company.Spring;

public class SaveToDataBase implements ISave
{
	@Override
	public void Save()
	{
		System.out.println("I am saving to db");
	}
}
