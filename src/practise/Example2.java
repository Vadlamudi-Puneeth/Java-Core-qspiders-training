package practise;

public class Example2 extends Example1{
	String name;
	String color;
	
	Example2(){
		System.out.println(name);
	}
	
	Example2(String name){
		this();
		this.name = name;
		System.out.println(name);
	}
	
	Example2(String name, String color){
		this(name);
		this.color = color;
		System.out.println(color);
	}
	
	public static void main(String[] args) {
		Example2 e = new Example2("lily","white");
	}
}
