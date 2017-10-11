package com.company.Patterns.Prototype;

public class PrototypeTest
{
	public static void Test(){
		Ekwipunek ekwipunek = new Ekwipunek();
		ekwipunek.FillItemsFromDataBase();

		try
		{
			Ekwipunek donatorEkwipunek = (Ekwipunek)ekwipunek.clone();
			donatorEkwipunek.AddToItems("SuperHiperMiecz");
			donatorEkwipunek.AddToItems("SuperHiperAxe");
			donatorEkwipunek.RemoveFromItems("Torch");
			Ekwipunek normalUser = (Ekwipunek)ekwipunek.clone();
			Ekwipunek Gm = (Ekwipunek)ekwipunek.clone();
			Gm.AddToItems("GMBlade");
			Gm.AddToItems("GMArmor");
			System.out.println("Donator:");
			donatorEkwipunek.PokaItemy();
			System.out.println("Normal User:");
			normalUser.PokaItemy();
			System.out.println("GM:");
			Gm.PokaItemy();

			System.out.println("Prototyp sie nie zmienil:");
			ekwipunek.PokaItemy();
		} catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}

	}

}
