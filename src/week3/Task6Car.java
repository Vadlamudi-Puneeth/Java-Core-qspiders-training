package week3;

public class Task6Car {
	private String name;
	private Task6Engine eng;
	Task6Car(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void CreateEngineObj() {
		eng = new Task6Engine(10);
	}
	
	public void showDetails() {
		System.out.println(name);
		System.out.println(eng.getHp());
	}
	
}
