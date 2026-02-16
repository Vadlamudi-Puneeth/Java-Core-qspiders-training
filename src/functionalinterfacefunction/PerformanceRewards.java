package functionalinterfacefunction;
import java.util.function.Function;

class Emp_Performance{
	String empName;
	int rating;
	public Emp_Performance(String empName, int rating) {
		super();
		this.empName = empName;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Emp_Performance [empName=" + empName + ", rating=" + rating + "]";
	}
}

public class PerformanceRewards {
	public static void main(String[] args) {
		Function<Emp_Performance, String> fn = (emp) -> {
			int rating = emp.rating;
			String res = "";
			
			if(rating > 8 && rating < 10) {
				res += "Employee of month";
			}else if(rating > 6 && rating < 8) {
				res += "stand out performer";
			}
			
			return res;
		};
		
		System.out.println(fn.apply(new Emp_Performance("nani", 7)));
		
	}
}
