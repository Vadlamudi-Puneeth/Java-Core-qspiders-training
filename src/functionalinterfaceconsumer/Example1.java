package functionalinterfaceconsumer;
import java.util.function.Consumer;

public class Example1 {
	public static void main(String[] args) {
//		void accept()
		
		Consumer<Integer> cm = (i) -> {
			for(int k = 1; k <= i; k++) {
				System.out.println(k * i);
			}
		};
		
		cm.accept(5);
		
	}
}
