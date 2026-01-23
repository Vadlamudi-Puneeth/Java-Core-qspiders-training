package multilevelinheritance;

public class Triangle extends Shape{
	int base;
	int height;

	
	Triangle(String type,int base,int height){
		super(type);
		this.base = base;
		this.height = height;
	}
	
	void displayArea() {
		System.out.println((base*height)/2);
	}
}
