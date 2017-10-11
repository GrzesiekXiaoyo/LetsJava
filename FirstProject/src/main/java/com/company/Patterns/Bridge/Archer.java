package com.company.Patterns.Bridge;

public class Archer implements ICharacter
{
	@Override
	public void Attack()
	{
		System.out.println("I am atacking with my bow!");
	}

	@Override
	public void Dodge()
	{
		System.out.println("Dodge");
	}
}
