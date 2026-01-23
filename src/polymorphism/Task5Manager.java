package polymorphism;

public class Task5Manager extends Task5Employee{
	
	int bonus;
	Task5Manager(int bonus){
		this.bonus = bonus;
	}
	
	@Override
	public void calculateBonus() {
		System.out.println(bonus);
	}
}
