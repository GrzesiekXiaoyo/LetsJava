package com.company.SpringWIthoutXML;

import com.company.Spring.ISave;

public class SaveToDataBase implements ISave
{
	@Override
	public void Save()
	{
		System.out.println("I am saving to db");
	}
}
