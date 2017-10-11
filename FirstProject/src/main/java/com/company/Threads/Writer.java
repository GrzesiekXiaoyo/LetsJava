package com.company.Threads;

public class Writer extends Thread
{
	private SharedNote note;

	public Writer(SharedNote note)
	{
		this.note = note;
	}

	@Override
	public void run()
	{
		String[] texts = new String[]{"ala", "poszla", "do", "kosciola", "bo", "byla", "glodna", null};
		for (String text : texts)
		{
			note.WriteNewText(text);
			try { // thinking about new word
				sleep((int)(Math.random() * 1000));
			} catch(InterruptedException exc) { }

		}
	}
}
