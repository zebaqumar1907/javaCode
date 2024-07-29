package com.wipro.multihreading;

public class Test1 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Test1 obj= new Test1();
		obj.setName("zeba");
		Test1 obj1 =new Test1();
		obj1.setName("wipro");
		obj.start();
		obj1.start();
	}

}
