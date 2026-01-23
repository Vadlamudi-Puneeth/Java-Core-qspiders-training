package collectiontreeset;

public class Biryani {
	int id;
	String name;
	int price;
	
	Biryani(int id, String name, int price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return id + " " + name + " " + price;
	}
	
}
