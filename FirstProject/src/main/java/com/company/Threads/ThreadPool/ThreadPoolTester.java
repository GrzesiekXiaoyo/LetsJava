package com.company.Threads.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTester
{

	public static void Test()
	{
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		for (int i = 0; i < 10; i++)
		{
			Runnable worker = new WorkerThread("" + i);
			executorService.submit(worker);
			//executorService.execute(worker);
		}

		executorService.shutdown();

		while (!executorService.isTerminated())
		{

		}

		System.out.println("Finished all threads");
	}
}
