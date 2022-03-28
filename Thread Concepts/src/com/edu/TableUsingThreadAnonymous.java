package com.edu;
class TableMain
{
	synchronized void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"x"+i+"="+n*i);
		}
	}
}

public class TableUsingThreadAnonymous {
public static void main(String[] args) {
	// ANNONYMOUS CLASS USING OBJECT
	        TableMain t1=new TableMain();
			Thread tob=new Thread()
			 {
			public void run()
			{
			System.out.println("Run method");
			t1.printTable(4);
			}
			};
			tob.start();
			
			
			
			/*Thread tob1=new Thread()
			{
				public void run()
				{
					System.out.println("Run method");
					t1.printTable(10);
				}
			};
				tob1.start();
}*/

				//OR
new Thread()
{
	public void run()
	{
		System.out.println("Run method");
		t1.printTable(10);
	}
}.start();
}

				
}

