package comparable;

public class Chocolate implements Comparable<Chocolate>{
	
	@Override
	public int compareTo(Chocolate c) {
//		return c.id - this.id; //descending order
		return this.id - c.id;
	}
	

	
	int id;
	String name;
	int price;
	
	Chocolate(int id, String name, int price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return getId() + " " + getName() + " " + getPrice();
	}
	
}
