package exceptionhandling;

public class Check {
	
	public static void main(String[] args) {
		try {			
			checkAge(6);
		}catch(InvalidAgeException i) {
			System.out.println(i.getMessage());
		}
	}
	
	
	public static void checkAge(int age) throws InvalidAgeException{
		if(age > 18) {
			System.out.println("you are eligible to vote");
		}else {
			// throw an object explicitly
			throw new InvalidAgeException("minimum age to vote is 18");
		}
	}
	
}
