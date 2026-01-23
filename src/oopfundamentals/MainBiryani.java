package oopfundamentals;

public class MainBiryani {
	public static void main(String args[]) {
//		MainBiryani mb1 = new MainBiryani();
//		MainBiryani mb2 = mb1;
//		System.out.println(mb1 == mb2);
		
		Biryani b = new Biryani();
		b.display();
		Biryani b1 = new Biryani();
		b1.display();
		System.out.println(b1.i + b1.j);
	}
}
