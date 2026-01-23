package inheritance;

public class Task17C extends Task17B{
	int x = 30;
	Task17C(int x){
		super(x-10);
		this.x = x;
	}
	
	public void display() {
		System.out.println(x);
		super.display();
	}
	
	public static void main(String args[]) {
		Task17C t17 = new Task17C(30);
		t17.display();
	}
}
