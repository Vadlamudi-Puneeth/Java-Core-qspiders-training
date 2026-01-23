package inheritance;

public class Task6Employee extends Task6Person{
	int eId;
	Task6Employee(int eId, String name, int age){
		super(name, age);
		this.eId = eId;
	}
	
	public void displayEmployee() {
		super.displayPerson();
		System.out.println(eId);
	}
}
