package dailyprograms;

public class LogicalOperators {
	 public static void main(String[] args) {

	        // Logical AND
	        System.out.println("\nLogical AND ");

	        int age = 20;
	        boolean res1 = (age == 13 && age < 21);
	        boolean res2 = ('a' >= 97 && 'a' == 'b');
	        boolean res3 = ('a' == 98 && 'z' >= 122);
	        boolean res4 = (age == 20 && age < 21);
	        System.out.println(res1);
	        System.out.println(res2);
	        System.out.println(res3);
	        System.out.println(res4);

	        // Logical OR
	        System.out.println("\nLogical OR ");

	        boolean res5 = (age >= 18 || age < 25);
	        boolean res6 = ('a' >= 97 || 'a' == 'b');
	        boolean res7 = ('a' == 98 || 'z' >= 122);
	        boolean res8 = ('a' == 99 || 'z' <= 12);
	        System.out.println(res5);
	        System.out.println(res6);
	        System.out.println(res7);
	        System.out.println(res8);

	        // Logical NOT
	        System.out.println("\nLogical NOT ");

	        boolean res9 = (!(9 % 2 == 0));
	        boolean res10 = (!(9 % 2 == 1));
	        System.out.println(res9);
	        System.out.println(res10);

	        //
	        System.out.println("\nshoes");
	        String str1 = "red tape";

	        boolean ans = !str1.equals("puma") || !str1.equals("Nike");
	        System.out.println(ans + " he can purchase");

	    }
}
