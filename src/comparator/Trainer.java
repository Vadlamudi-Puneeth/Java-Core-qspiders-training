package comparator;

public class Trainer {
	int id;
	String name;
	String sub;
	
	Trainer(int id, String name, String sub){
		this.id = id;
		this.name = name;
		this.sub = sub;
	}
	
	public String toString() {
		return id + " " + name + " " + sub;
	}
	
}
