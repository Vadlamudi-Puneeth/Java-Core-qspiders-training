package com.practice;

public class MyThread1 extends Thread{

	public void run() {
		
		for(int i=0;i<1000;i++) {
			Share.incrCount();
		}
	}
}
