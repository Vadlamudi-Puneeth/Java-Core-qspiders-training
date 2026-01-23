package abstractionusinginterface;

public interface Example {
	static void demo() {
		System.out.println("haii");
	}
	
//	int a = 10;
	static int a = 10;
//	void test() {
//		
//	}
//	Example(){
//		System.out.println("Example constructor");
//	}
	
	public static void main(String args[]) {
//		a=16; //this is by default final you cannot re initialise then CTE
		System.out.println(a);
//		Example e = new Example();	
	}
}
