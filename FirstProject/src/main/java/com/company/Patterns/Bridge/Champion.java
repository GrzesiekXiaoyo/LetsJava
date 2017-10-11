package com.company.Patterns.Bridge;

public class Champion
{
	private ICharacter character;
	public Champion(ICharacter character)
	{
		this.character = character;
	}

	public void CallAttack()
	{
		character.Attack();
	}

	public void CallDodge()
	{
		character.Dodge();
	}
}
