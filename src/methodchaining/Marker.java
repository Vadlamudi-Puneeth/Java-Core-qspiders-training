package methodchaining;

public class Marker {
	int price;
	String color;
	
	public Marker setPrice(int price) {
		this.price = price;
		return this;
	}
	
	public Marker setColor(String color) {
		this.color = color;
		return this;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getPrice() {
		return price;
	}
	
	

	
}
