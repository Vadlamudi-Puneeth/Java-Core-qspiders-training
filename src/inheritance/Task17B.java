package inheritance;

public class Task17B extends Task17A{
	int x = 20;
	Task17B(int x){
		super(x-10);
		this.x = x;
	}
	public void display() {
		System.out.println(x);
		super.display();
	}
}
