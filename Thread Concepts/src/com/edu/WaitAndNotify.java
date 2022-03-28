package com.edu;

//Wait and Notify method
class Life extends Thread{
	int total;
	public void run() {
		System.out.println("Inside run");
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				total=total+i;
			}
			notify();
		}
	}
	
}
public class WaitAndNotify {
public static void main(String[] args) throws InterruptedException {
	
	  Life ob=new Life();
	  ob.start();
	  synchronized (ob) {
		  try {
			  System.out.println("Before Wait");
			  ob.wait();
			  System.out.println("After Wait");
			  System.out.println("Total="+ob.total);
			  
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
	  }
		
	}
}
