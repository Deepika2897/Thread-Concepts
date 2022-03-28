package com.edu;

public class ThreadAnonymous {

	public static void main(String[] args) {
		// ANNONYMOUS CLASS USING OBJECT
		/*Thread tob=new Thread()
		 {
		public void run()
		{
		System.out.println("Run method");
		}
		};
		tob.start();
		*/ 
		//OR
		//WITHOUT USING OBJECT
		new Thread()
		{
			public void run()
			{
				System.out.println("Run method");
			}
			}.start();
			
			//USING RUNNABLE INTERFACE
		Runnable rob=new Runnable() {
				@Override
			public void run() {
				System.out.println("Runnable Run Method");
				
			}
		};
Thread tob1=new Thread(rob);
tob1.start();
	}

}
