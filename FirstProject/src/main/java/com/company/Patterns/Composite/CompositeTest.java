package com.company.Patterns.Composite;

public class CompositeTest
{
	public static void Test()
	{
		Dog firstDog = new Dog();
		firstDog.Eat();

		Dog secondDog = new Dog();
		Composite composite = new Composite();

		composite.Add(firstDog);
		composite.Add(secondDog);

		composite.Eat();

		//wykonanie Eat jakby composite byl pojedynczmy obiektem
	}
}
