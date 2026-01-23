package dailyprograms;

public class ConditionalOperators {
	 public static void main(String[] args) {

	        // using value
	        // System.out.println("Using values");
	        // int a = 10;
	        // int b = 20;
	        // int ans = a > b ? a : b;
	        // System.out.println(ans);
	        
	        // // using boolean
	        // System.out.println("\nusing boolean");
	        // String name = "nani";
	        // boolean bo = (name.equals("nani")? true: false);
	        // System.out.println(bo);

	        // // using expression
	        // System.out.println("\nUsing expressions");
	        // int marks = 89;
	        // int r = (marks >= 35 ? marks+10 : marks-10);
	        // System.out.println(r);

	        // // using string
	        // System.out.println("\nUsing String");
	        // int age = 19;
	        // String res = (age >= 18? "Eligible": "Not Eligible");
	        // System.out.println(res);

	        // Greatest of 3 numbers
	        // int a = 21;
	        // int b = 21;
	        // int c = 19;

	        // int num = (a > b) ? a : b;
	        // int largest = (num > c) ? num : c;

	        // int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
	        // System.out.println(largest);

	        // check num is +ve/-ve/0 
	        int a = -1;
	        String num = (a >= 0) ? (a > 0 ? "positive" : "equal to 0") : "negative";
	        System.out.println(num);

	    }
}
