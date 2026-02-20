package onlyfunctionalinterfacepredicate;

public class Main3 {
	public static void main(String[] args) {
		Consumer<Integer> cos = i -> System.out.println(i*2); 
		cos.accept(4);
		
		Consumer<String> cos1 = i -> System.out.println(i.length());
		cos1.accept("puneeth");
	}
}
