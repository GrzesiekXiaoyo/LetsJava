package com.company.Polimorfizm;

public class PolimorfizmTester
{
	public static void Test()
	{
		Cat cat = new Cat();
		Dog dog = new Dog();
		Chair chair = new Chair();
		CallGiveVoice(cat);
		CallGiveVoice(dog);

		CallGoForward(cat);
		CallGoForward(chair);
		CallGoForward(dog);
	}

	private static void CallGiveVoice(IAnimal animal)
	{
		animal.GiveVoice();
	}

	private static void CallGoForward(IGoForward goForward)
	{
		goForward.GoForward();
	}
}
