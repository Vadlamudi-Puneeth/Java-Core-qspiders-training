package encapsulation;

public class Task10 {
	private int roll;
	private String name;
	int count = 0;

	Task10(int roll,String name){
		this.roll = roll;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
	}
}
