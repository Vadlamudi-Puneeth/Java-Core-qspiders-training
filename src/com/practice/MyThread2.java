package com.practice;

public class MyThread2 extends Thread{

     public void run() {
		
		for(int i=0;i<1000;i++) {
			 Share.incrCount();
		}
	}
}
