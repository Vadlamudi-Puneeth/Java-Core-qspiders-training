package dailyprograms;

public class AssignmentOperators {
	 public static void main(String[] args) {
	        
	        System.out.println("Emp1 data");
	        int emp1Salary = 5000;

	        int bonus1 = 2000;
	        emp1Salary += bonus1;

	        int credit1 = 1500;
	        emp1Salary += credit1;

	        int debit1 = 1200;
	        emp1Salary -= debit1;

	        emp1Salary *= 2;
	        emp1Salary *= 12;

	        System.out.println("Annual Salary of emp1  " + emp1Salary);

	        System.out.println("Monthly Salary of emp1  " + emp1Salary / 12);

	        System.out.println("\nEmp2 data");

	        int emp2Salary = 5000;

	        int bonus2 = 1300;
	        emp2Salary += bonus2;
	        
	        int debit2 = 1000;
	        emp2Salary -= debit2;

	        int credit2 = 2500;
	        emp2Salary += credit2;

	        int deduct = 1200;
	        emp2Salary = emp2Salary - deduct;

	        emp2Salary *= 2;
	        emp2Salary *= 12;

	        System.out.println("Annual salary of emp2 " + emp2Salary);

	        System.out.println("Monthly Salary of emp2  " + emp2Salary / 12);


	    }
}
