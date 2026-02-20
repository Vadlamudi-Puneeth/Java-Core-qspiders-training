package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String args[]) {
		
		  List<Integer> l1=Arrays.asList(1,2,43,6,23,7);
		  List<String> l2=Arrays.asList("vamsi","puneeth","varun");
		  
		  Collections.sort(l1);
		  Collections.sort(l2);
		  
		  System.out.println(l1);
		  System.out.println(l2);
		  
		  Student s1=new Student(10,"vamsi");
		  Student s2=new Student(20,"puneethyu");
		  Student s3=new Student(30,"varunvvui");

		  List<Student> l3=Arrays.asList(s1,s2,s3);
		 
		   Collections.sort(l3);
		   System.out.println(l3);
		   
		   
		   Collections.sort(l3,new ByName());
		   System.out.println(l3);
		   
		   
		  
	}
	
		
	  }

class ByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.length()-o2.name.length();
		
	}
	
}

