package week3;

public class Task5School {
	private String name;
	private Task5Prinicipal prince;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	Task5School(String name){
		this.name = name;
		this.prince = new Task5Prinicipal("nani");
	}
	
	public void showDetails() {
		System.out.println(name);
		System.out.println(prince.getName());
	}
	
}
