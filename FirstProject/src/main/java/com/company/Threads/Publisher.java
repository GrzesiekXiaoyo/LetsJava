package com.company.Threads;

public class Publisher extends Thread
{
	private SharedNote note;


	public Publisher(SharedNote note)
	{
		this.note = note;
	}

	@Override
	public void run()
	{
		String text = note.PublishToConsole();
		while(text!=null)
		{
			System.out.println("-> "+text);
			text = note.PublishToConsole();
		}
	}
}
