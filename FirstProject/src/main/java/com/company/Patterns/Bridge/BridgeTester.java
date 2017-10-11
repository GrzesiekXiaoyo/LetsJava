package com.company.Patterns.Bridge;

public class BridgeTester
{
	public static void Test()
	{
		Champion[] champions = new Champion[]
				{
						new Champion(new Archer()),
						new Champion(new Warrior())
				};

		for (Champion champion : champions)
		{
			champion.CallAttack();
			champion.CallDodge();
		}
	}
}
