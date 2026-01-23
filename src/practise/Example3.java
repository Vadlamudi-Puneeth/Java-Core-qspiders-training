package practise;

public class Example3 {
	private String color;
	private double capacity;
	
	Example3(){
		
	}
	
	public Example3(String color,double capacity) {
		this.color = color;
		this.capacity = capacity;
	}
	
	public Example3 setColor(String color) {
		this.color = color;
		return this;
	}
	
	public String getColor() {
		return color;
	}
	
	public Example3 setCapacity(double capacity) {
		this.capacity = capacity;
		return this;
	}
	
	public double getCapacity() {
		return capacity;
	}
	
	public Example3 displayProperties() {
		System.out.println(color);
		System.out.println(capacity);
		return this;
	}
	
}
