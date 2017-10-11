package com.company.Threads;

public class ThreadTester
{
	public static void Test()
	{
		SharedNote note = new SharedNote();
		Publisher publisher = new Publisher(note);
		Writer writer = new Writer(note);

		writer.start();
		publisher.start();

	}
}
