package com.company.Threads;

public class SharedNote
{
	String text = "";
	boolean newText = false;

	public synchronized void WriteNewText(String s)
	{
		while (newText == true)
		{
			try
			{
				wait();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

		text = s;
		newText = true;
		notifyAll();
	}

	public synchronized String PublishToConsole()
	{
		while (newText == false)
		{
			try
			{
				wait();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

		newText = false;
		notifyAll();
		return text;
	}
}
