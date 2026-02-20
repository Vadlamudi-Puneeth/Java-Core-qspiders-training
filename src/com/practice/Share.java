package com.practice;

public class Share {

	static int count;
	
	public static synchronized void incrCount() {
		 count++;
	}
	
	   
}
