package onlystreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class TasksInRepo {
	public static void main(String[] args) {
		List<Employee> empl = getEmployee();
//		Map<String, List<Employee>> map = empl.stream()
//				.collect(Collectors.groupingBy(emp -> emp.getDepartment()));
//		
//		for(Map.Entry<String, List<Employee>> m: map.entrySet()) {
//			System.out.println(m.getKey());
//			for(Employee e: m.getValue()) {
//				System.out.println(e);
//			}
//		}
//		System.out.println(map);
		
		
//		Map<String, Long> map = empl.stream()
//									.collect(Collectors.groupingBy(emp -> emp.getDepartment(), LinkedHashMap::new, Collectors.counting()));
//		
//			for(Map.Entry<String, Long> m: map.entrySet()) {
//				System.out.println(m.getKey() + " " + m.getValue());
//				
//			}
//		System.out.println(map);
		
//		Map<String, Double> map = empl.stream()
//				.collect(Collectors.groupingBy(
//							emp -> emp.getDepartment(),
//							LinkedHashMap::new,
//							Collectors.averagingDouble(emp -> emp.getSalary())
//						));
//		
//		System.out.println(map);
		
		List<Employee> list = getEmployee();
//		sortBySalary(list);
		
//		youngAndOldEmp(list);
//		employeeName(list);
		countWordFrequencyInSentence();
		
	}
	
	public static void sortBySalary(List<Employee> list) {
		Collections.sort(list, new SortBySalary());
		System.out.println(list);
	}
	
	
	public static void youngAndOldEmp(List<Employee> list) {
		OptionalInt young = list.stream()
					.mapToInt(e -> e.getAge()).min();
		
		System.out.println(young.getAsInt());
		
		
		
		int old = list.stream()
						.mapToInt(e -> e.getAge()).max().getAsInt();
		
		System.out.println(old);
	}
	
	

	
	public static void highestPaidEmp(List<Employee> list){
		OptionalDouble max = list.stream()
		        .mapToDouble(e -> e.getSalary())
		        .max();
		
		List<Employee> l = list.stream()
			.filter(e -> e.getSalary() == max.getAsDouble()).collect(Collectors.toList());
			
		
		System.out.println(l);
	}
	
	
	
	
	
	
	public static List<Employee> getEmployee(){
		 List<Employee> employeeList = new ArrayList<>();

		  employeeList.add(new Employee(101, "Arjun Kumar", 28, "Male", "IT","Software Engineer", 55000, "Chennai","arjun.kumar@gmail.com", "9876543210"));

		  employeeList.add(new Employee(102, "Priya Sharma", 30, "Female", "HR","HR Manager", 60000, "Bangalore","priya.sharma@gmail.com", "9876543211"));

		        employeeList.add(new Employee(103, "Rahul Verma", 26, "Male", "IT",
		                "QA Engineer", 45000, "Hyderabad",
		                "rahul.verma@gmail.com", "9876543212"));

		        employeeList.add(new Employee(104, "Sneha Reddy", 32, "Female", "Finance",
		                "Accountant", 52000, "Mumbai",
		                "sneha.reddy@gmail.com", "9876543213"));

		        employeeList.add(new Employee(105, "Vikram Singh", 35, "Male", "Sales",
		                "Sales Manager", 70000, "Delhi",
		                "vikram.singh@gmail.com", "9876543214"));

		        employeeList.add(new Employee(106, "Kavya Nair", 27, "Female", "IT",
		                "Backend Developer", 58000, "Kochi",
		                "kavya.nair@gmail.com", "9876543215"));

		        employeeList.add(new Employee(107, "Aditya Rao", 29, "Male", "Marketing",
		                "Marketing Analyst", 48000, "Pune",
		                "aditya.rao@gmail.com", "9876543216"));

		        employeeList.add(new Employee(108, "Meera Iyer", 31, "Female", "IT",
		                "Frontend Developer", 56000, "Chennai",
		                "meera.iyer@gmail.com", "9876543217"));

		        employeeList.add(new Employee(109, "Karan Mehta", 34, "Male", "Finance",
		                "Financial Analyst", 65000, "Ahmedabad",
		                "karan.mehta@gmail.com", "9876543218"));

		        employeeList.add(new Employee(110, "Divya Patel", 25, "Female", "Support",
		                "Support Executive", 40000, "Surat",
		                "divya.patel@gmail.com", "9876543219"));

		        employeeList.add(new Employee(111, "Rohit Gupta", 33, "Male", "IT",
		                "Team Lead", 75000, "Noida",
		                "rohit.gupta@gmail.com", "9876543220"));

		        employeeList.add(new Employee(112, "Anjali Desai", 28, "Female", "Sales",
		                "Sales Executive", 47000, "Vadodara",
		                "anjali.desai@gmail.com", "9876543221"));

		        employeeList.add(new Employee(113, "Suresh Babu", 36, "Male", "Operations",
		                "Operations Manager", 72000, "Coimbatore",
		                "suresh.babu@gmail.com", "9876543222"));

		        employeeList.add(new Employee(114, "Neha Joshi", 29, "Female", "HR",
		                "Recruiter", 46000, "Jaipur",
		                "neha.joshi@gmail.com", "9876543223"));

		        employeeList.add(new Employee(115, "Manish Yadav", 27, "Male", "IT",
		                "DevOps Engineer", 62000, "Gurgaon",
		                "manish.yadav@gmail.com", "9876543224"));
				return employeeList;
		        
		        
		 }
	
	
	
	
	
	public static void employeeName(List<Employee> list) {
		List<Employee> l = list.stream()
							.filter(e -> e.getName().toLowerCase().startsWith("a"))
							.collect(Collectors.toList());
		System.out.println(l);
	}
	
	public static void duplicateWordsInString() {
		String str = "hi nani hello nani how are you hello";
		String arr[] = str.split("\\s+");
		
		
		
	}
	
	public static void countWordFrequencyInSentence() {
		String str = "hi nani hello nani how are you hello";
		String arr[] = str.split("\\s+");
		
		Map<String, Integer>map = new LinkedHashMap<>();
		
		for(int i = 0;i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		System.out.println(map);
		
	}
	
	
	
	
}

class SortBySalary implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return Double.compare(e1.getSalary(), e2.getSalary());
	}
}
