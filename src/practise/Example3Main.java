package practise;

public class Example3Main {
	public static void main(String[] args) {
		String s = new Example3().displayProperties().setColor("blue").setCapacity(10).displayProperties().getColor();
		System.out.println(s);
	}
}
