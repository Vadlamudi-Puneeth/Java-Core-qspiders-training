package polymorphism;

public class Task5Developer extends Task5Employee{
	
	int bonus;
	Task5Developer(int bonus){
		this.bonus = bonus;
	}
	
	@Override
	public void calculateBonus() {
		System.out.println(bonus);
	}
}
