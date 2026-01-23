package operator;

public class Task3 {
	public static void main(String args[]) {
		
		 int rating = 4;
	        int experience = 6;
	        boolean disciplinaryAction = true;
	        int salary = 1000;

	        int finalSalary = (rating > 4 && experience > 5 && disciplinaryAction == false) ? (salary+=2000): salary;
	        System.out.println(finalSalary);
	}

}
