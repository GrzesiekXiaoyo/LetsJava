package com.company.Patterns.Fasada;

public class FasadaTester
{
	public static void Test()
	{
		HomeService homeService = new HomeService();
		homeService.LockAllDoor(); // komus co udostepniamy klase homeservice, nie obchodzi ile mamy drzwi i nie musi wiedziec jak je zamknac po prostu chce zamknac wszystkie drzwi w domu
	}
}
