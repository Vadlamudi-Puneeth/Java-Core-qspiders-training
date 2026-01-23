package anonymousclass;

public class CalciMain {
	public static void main(String[] args) {
		
		Calci c = new Calci() {
			
			@Override
			public void add() {
				System.out.println(3 + 4);
			}
			
			@Override
			public void printEven(int low, int high) {
				for(int i = low; i <= high; i++) {
					if(i % 2 == 0) {
						System.out.print(i + " ");
					}
				}
				
			}
	
		};
		
		c.add();
		c.printEven(5, 15);
		
	}
}
