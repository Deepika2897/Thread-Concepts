package com.edu;

class HelloThread extends Thread
{
	public HelloThread(String string)
	{
		super(string);//Super class constructor
	}

public void run()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println("i="+i+" thread name"+Thread.currentThread());
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public class ThreadUsingForLoop {
	public static void main(String[] args)throws InterruptedException
	{
	HelloThread tob1=new HelloThread("First");
	HelloThread tob2=new HelloThread("Second");
	HelloThread tob3=new HelloThread("Third");
	tob1.start();
	tob1.join();
	tob2.start();
	}
	
}
}
