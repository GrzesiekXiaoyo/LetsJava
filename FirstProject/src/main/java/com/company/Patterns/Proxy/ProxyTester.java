package com.company.Patterns.Proxy;

public class ProxyTester
{
	public static void Test()
	{
		ProxyImage image1 = new ProxyImage("cat.jpg");
		ProxyImage image2 = new ProxyImage("dog.jpg");

		image1.DisplayImage();
		image1.DisplayImage();
		image1.DisplayImage();
		image1.DisplayImage();
		image1.DisplayImage();
		image2.DisplayImage();
		image2.DisplayImage();
		image2.DisplayImage();

		/*
		Output:
		Loading image: cat.jpg
		Display image
		Display image
		Display image
		Display image
		Display image
		Loading image: dog.jpg
		Display image
		Display image
		Display image
		 */
	}
}
