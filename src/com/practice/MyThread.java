package com.practice;

public class MyThread extends Thread{

	   public void run() {
		     System.out.println("child thread is running");
		     
		     for(int i=0;i<200000;i++) {
		    	 if(i%2==0) {
		    		 try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
		    	 }
		    	  System.out.println("hero");
		     }
	   }
}
