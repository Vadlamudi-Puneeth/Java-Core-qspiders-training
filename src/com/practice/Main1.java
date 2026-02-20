package com.practice;

import java.util.function.Predicate;

public class Main1 {

	public static void main(String args[]) {
		
//		A a1=new D();
//		a1.add();
		
		A a2=new A() {

			@Override
			public void add() {
				System.out.println("add1");
			}
			
		};
			  
		a2.add();
		
		// lambda expression --> no name, no return type
		A a3=()-> System.out.println("adding");
	    a3.add();
	    
	    C c=(a,b)-> {return a+b;};
	    
	    C c1=(a,b)-> a+b;
	    
	    B b=a->a;
	    
	    
	      Predicate<Integer> p1=a->a%2==0;
	      System.out.println(p1.test(2));
	      
	  //  Function
	     
	/*    
	    Predicate{
	    	
	    	public boolean test(T t){
	    	
	    	  }
	    	   
	    }
	    
	    interface B{
	    
	      int mul(int a,int b);
	      
	      }
	      
	      B b = (a,b)-> a*b;
	      
	      
	    
	*/	
	      
	      
		
		
		
	}

}
