package com.company.Patterns.Proxy;

public class RealImage implements IImage
{
	public RealImage(String fileName)
	{
		LoadImageFromFile(fileName);
	}

	private void LoadImageFromFile(String filename)
	{
		System.out.println("Loading image: "+filename);
	}

	@Override
	public void DisplayImage()
	{
		System.out.println("Display image");
	}
}
