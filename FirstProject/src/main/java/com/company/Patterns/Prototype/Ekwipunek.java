package com.company.Patterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Ekwipunek implements Cloneable
{
	private ArrayList<String> items;

	public Ekwipunek()
	{
		items = new ArrayList<String>();
	}

	public void AddToItems(String item)
	{
		items.add(item);
	}

	public void RemoveFromItems(String item)
	{
		items.remove(item);
	}

	public void FillItemsFromDataBase()
	{
		// laczenie do bazy danych
		// wyciagniecie selectem itemow
		// przypisanie itemow np

		items.add("Torch");
		items.add("Boots");
		items.add("HP-Potion");
		items.add("HP-Potion");
		items.add("MP-Potion");
		items.add("MP-Potion");
	}

	public void PokaItemy()
	{
		items.forEach(item-> System.out.print(item+ " "));
		System.out.println();
	}


	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		Ekwipunek ekwipunek = new Ekwipunek();

		this.items.forEach(item->ekwipunek.items.add(item));

		return ekwipunek;
	}
}
