package onlyfunctionalinterfaceconsumer;

import java.util.List;
import java.util.function.Consumer;

public class StudentPrinterUtil {
	
	public void applyConsumer(List<StudentPrinter> students, Consumer<StudentPrinter> consumer) {
		consumer = c -> System.out.println(c.getName().toUpperCase());
		students.forEach(consumer);
	}
	
	
	public Consumer<StudentPrinter> printStudent(){
		Consumer<StudentPrinter> consumer = s -> System.out.println(s.getDept()+ " " + s.getName() + " ");
		return consumer;
	}
	
	
	
	
	
	
	
}
