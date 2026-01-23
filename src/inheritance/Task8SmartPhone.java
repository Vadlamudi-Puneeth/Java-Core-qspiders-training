package inheritance;

public class Task8SmartPhone extends Task8Mobile{
	int camPx;
	int internet;
	Task8SmartPhone(int camPx, int internet, String name, String simType){
		super(name, simType);
		this.camPx = camPx;
		this.internet = internet;
	}
	
	public void display() {
		super.displayMobile();
		System.out.println(camPx);
		System.out.println(internet);
	}
}
