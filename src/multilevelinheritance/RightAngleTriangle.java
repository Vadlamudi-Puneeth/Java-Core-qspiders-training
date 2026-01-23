package multilevelinheritance;

public class RightAngleTriangle extends Triangle{
	
	RightAngleTriangle(String type,int base, int height){
		super(type,base,height);
	}
	
	public static void main(String args[]) {
		RightAngleTriangle t = new RightAngleTriangle("triangle",2,3);
		t.displayArea();
		
		System.out.println(t.type);
		System.out.println(t.height);
		System.out.println(t.base);
		
	}
}
