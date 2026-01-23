package nonprimitivetypecasting;

public class Animal {
	public static void main(String args[]) {
		int var = 10;
		
		Dog d = new Dog();
		Animal a = d; // up casting
		
		
		
		if(a instanceof Cat) {			
			Cat c = (Cat)a;
			c.meow();
		}else {
			Dog d1 = (Dog)a; // down cast
			d1.bark();
		}
		
	}
}
