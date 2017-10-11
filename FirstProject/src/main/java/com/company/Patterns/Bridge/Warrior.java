package com.company.Patterns.Bridge;

public class Warrior implements ICharacter
{
	@Override
	public void Attack()
	{
		System.out.println("Attack attack attack !!");
	}

	@Override
	public void Dodge()
	{
		System.out.println("Dodge? better is attack!");
	}
}
