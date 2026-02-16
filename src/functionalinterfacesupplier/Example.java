package functionalinterfacesupplier;

import java.util.function.Supplier;

public class Example {
	public static void main(String[] args) {
////		get()
//		Supplier<Double> sup = () -> {
//			return Math.random();
//		};
//		
//		System.out.println(sup.get());
	
	
		Supplier<String> sup = () -> {
			String otp = "";
			
			for(int i = 0;i < 6; i++)
				otp += (int)(Math.random() * 10);
			
			return otp;
		};
		
		System.out.println(sup.get());
	}	
}
