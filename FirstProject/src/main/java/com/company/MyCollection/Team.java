package com.company.MyCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Team
{

	ArrayList<String> listOfPlayer;
	String[] tablicaStringow = new String[]{"test", "ula", "ala"};

	public Team()
	{
		listOfPlayer = new ArrayList<String>();
		listOfPlayer.add("1");
		listOfPlayer.add("2");
		listOfPlayer.add("3");
	}

	public Team(ArrayList<String> players)
	{
		listOfPlayer = players;
	}

	public void SelectAllPlayersOnTable()
	{
		System.out.println("1. for (String name : tablicaStringow)");
		for (String name : tablicaStringow)
		{
			System.out.println(name);
		}

		System.out.println("2. for (int i = 0; i < tablicaStringow.length; i++)");
		for (int i = 0; i < tablicaStringow.length; i++)
		{
			System.out.println(tablicaStringow[i]);
		}

		System.out.println("3. for (int i = tablicaStringow.length - 1; i >= 0; i--)");
		for (int i = tablicaStringow.length - 1; i >= 0; i--)
		{
			System.out.println(tablicaStringow[i]);
		}

		System.out.println("4. tablicaStringow nie ma metody forEach");


		System.out.println("5.  while (j < tablicaStringow.length)");
		int j = 0;
		while (j < tablicaStringow.length)
		{
			System.out.println(tablicaStringow[j]);
			j++;
		}

		System.out.println("6. while (t >= 0) dla tablicy stringow");
		int t2 = tablicaStringow.length - 1;
		while (t2 >= 0)
		{
			System.out.println(tablicaStringow[t2]);
			t2--;
		}

	}

	public String SelectAllPlayersOnArrayList(Operation operation)
	{
		StringBuilder builder = new StringBuilder();

		switch (operation)
		{
			case ForEach:
			{
				for (String name : listOfPlayer)
				{
					builder.append(name);
				}
				break;
			}
			case ForAdd:
			{
				for (int i = 0; i < listOfPlayer.size(); i++)
				{
					builder.append(listOfPlayer.get(i));
				}
				break;
			}
			case ForSub:
			{
				for (int i = listOfPlayer.size() - 1; i >= 0; i--)
				{
					builder.append(listOfPlayer.get(i));
				}
				break;
			}
			case ForEachLambda:
			{
				listOfPlayer.forEach(name -> builder.append(name));
				break;
			}
			case WhileAdd:
			{
				int j = 0;
				while (j < listOfPlayer.size())
				{
					builder.append(listOfPlayer.get(j));
					j++;
				}
				break;
			}
			case WhileSub:
			{
				int t = listOfPlayer.size() - 1;
				while (t >= 0)
				{
					builder.append(listOfPlayer.get(t));
					t--;
				}
				break;
			}
			case Iterator:
			{
				Iterator<String> iterator = listOfPlayer.iterator();
				while (iterator.hasNext())
				{
					builder.append(iterator.next());
				}
				break;
			}
		}

		return builder.toString();
	}


}
