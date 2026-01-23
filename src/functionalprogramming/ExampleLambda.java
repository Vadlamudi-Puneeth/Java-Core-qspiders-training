package functionalprogramming;

public class ExampleLambda {
	public static void main(String[] args) {
		
//		Calci c = () -> {System.out.println("hi");};
//		c.add();
		
//		Calci c1 = () -> "Hello";
//		System.out.println(c1.demo());
		
//		Calci c2 = (a) -> {
//			System.out.println("i got " + a);
//		};
//		c2.test(10);
		
//		Calci c3 = (a) -> {
//			return a * a;
//		};
//		
//		System.out.println(c3.test(10));

	
//		Calci c4 = (a) -> {
//			if(a % 2 == 0)
//				System.out.println("even number");
//			else
//				System.out.println("odd number");
//		};
//		
//		c4.evenOrOdd(11);
		
		Calci c5 = (low, high) -> {
			for(int i = low; i <= high; i++) {
				if(i % 2 == 0) {
					System.out.print(i + " ");
				}
			}
		};
		
		c5.evenNums(10, 22);
		
	}
}
