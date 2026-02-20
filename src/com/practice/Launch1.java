package com.practice;

public class Launch1 {

	public static void main(String args[]) throws InterruptedException {
		
		  MyThread1 t1=new MyThread1();
		  t1.start();
		  
		  MyThread2 t2=new MyThread2();
		  t2.start();
		  
		  t1.join();
		  t2.join();
		  
		  System.out.println(Share.count);
		  
	}
}
