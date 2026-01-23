package inheritance;

public class Task13Patient extends Task13Person{
	String disease;
	int patientId;
	
	Task13Patient(String name, int age, String disease, int patientId){
		super(name, age);
		this.disease = disease;
		this.patientId = patientId;
	}
	
	public void display() {
		super.display();
		System.out.println(disease + "\n" + patientId);
	}
	
}
