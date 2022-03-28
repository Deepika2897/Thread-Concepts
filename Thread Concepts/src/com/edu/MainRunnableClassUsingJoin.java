package com.edu;

//Creating Thread by implementing Runnable interface
class MyThread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside run method"+Thread.currentThread());
	}
}

public class MainRunnableClassUsingJoin {

	public static void main(String[] args) throws InterruptedException {
		MyThread1 ob=new MyThread1();
		//start method is defined in Thread
		//create an object Thread class then pass the object of class
		//which implements Runnable interface as an argument
		
		Thread tob=new Thread(ob);
		tob.setName("MyFirstThread");
	    tob.start();//Execution of thread is controlled by JVM,you cannot predict the output
		tob.join();
	    MyThread2 ob1=new MyThread2();
		Thread tob1=new Thread(ob1);
		tob1.setName("MySecondThread");
		tob1.start();
		MyThread2 ob2=new MyThread2();
		Thread tob2=new Thread(ob2);
		tob2.setName("MyThirdThread");
		tob2.start();
		
		}

}


