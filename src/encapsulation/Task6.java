package encapsulation;

public class Task6 {
	private int age;
	public void setAge(int age) {
		if(age >= 5 && age <= 25) {			
			this.age = age;
		}
	}
	public int getAge() {
		return age;
	}
}
