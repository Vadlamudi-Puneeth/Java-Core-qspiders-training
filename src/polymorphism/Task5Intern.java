package polymorphism;

public class Task5Intern extends Task5Employee{
	int bonus;
	Task5Intern(int bonus){
		this.bonus = bonus;
	}
	@Override
	public void calculateBonus() {
		System.out.println(bonus);	
	}
}
