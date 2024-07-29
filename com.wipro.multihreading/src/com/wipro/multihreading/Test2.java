package com.wipro.multihreading;

public class Test2 implements Runnable {
	public void run()
		{
			System.out.println(Thread.currentThread().getName()+ "-->"+ i);
			
		}

	public class Test3 {
		
		public static void main(String[] args) {
			
			//create the Runnable object
			Runnable obj = new Test2();
			
			//convert Runnable object into Thread object
			
			
			Thread t = new Thread(obj);
			t.setName("rk");
			t.start();
			
			
		}

	}