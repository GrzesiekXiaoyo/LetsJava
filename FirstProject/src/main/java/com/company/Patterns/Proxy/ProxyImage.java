package com.company.Patterns.Proxy;

public class ProxyImage implements IImage
{
	private RealImage realImage= null;
	private String fileName ;

	public ProxyImage(String fileName)
	{
		this.fileName = fileName;
	}

	@Override
	public void DisplayImage()
	{
		if(realImage==null)
		{
			realImage = new RealImage(fileName);
		}

		realImage.DisplayImage();
	}
}
