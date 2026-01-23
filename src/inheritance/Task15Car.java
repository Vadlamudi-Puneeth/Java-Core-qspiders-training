package inheritance;

public class Task15Car extends Task15Vehicle{
	int speed;
	Task15Car(int speed){
		super(speed+20);
		this.speed = speed;
	}
	public void display() {
		super.display();
		System.out.println("Car speed" + this.speed);
		System.out.println("vehicle" + super.speed);
	}
}
