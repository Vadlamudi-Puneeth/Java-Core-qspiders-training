package onlyfunctionalinterfaceconsumer;

import java.util.function.Consumer;

public class EmployeeUtil {
	public Consumer<Employee> ww(double percent){
		Consumer<Employee> co = e -> e.setSalary(e.getSalary() * (percent / 100));
		return co;
	}
}
