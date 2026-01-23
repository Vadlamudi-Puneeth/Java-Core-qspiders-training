package operator;

public class Task7 {
	public static void main(String args[]) {
		int stock_quantity = 9;
		boolean fast_moving = false;
		boolean isdiscontinued = true;
		
		 int reorder = ((stock_quantity < 10 || fast_moving) && !isdiscontinued)? stock_quantity+=20 : stock_quantity;
		
		 System.out.println(reorder);
		
	}
}
