package com.practice;

public class Student implements Comparable<Student>{

	int id;
	String name;
	
	@Override
	public int compareTo(Student o) {
		
		String name=o.name;
		int count=0;
		for(int i=0;i<name.length();i++) {
			 if(name.charAt(i)=='v') count++;
		}
		int count1=0;
		String name1=this.name;
		for(int i=0;i<name1.length();i++) {
			 if(name1.charAt(i)=='v') count1++;
		}
		
		return count-count1;
		
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

