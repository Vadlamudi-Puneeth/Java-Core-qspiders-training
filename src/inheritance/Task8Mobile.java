package inheritance;

public class Task8Mobile extends Task8Device{
	String SimType;
	Task8Mobile(String name, String SimType){
		super(name);
		this.SimType = SimType;
	}
	
	public void displayMobile() {
		super.displayDevice();
		System.out.println(SimType);
	}
}
