package com.practice;

public class Launch {

	public static void main(String args[]) {
		
		System.out.println("before main thread");
		  MyThread t1=new MyThread();
		  t1.start(); // thread created
		//  t1.run();  
		System.out.println("after main thread");
	}
}
