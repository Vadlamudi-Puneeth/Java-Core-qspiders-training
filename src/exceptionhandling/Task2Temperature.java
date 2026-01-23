package exceptionhandling;

public class Task2Temperature {
	public static void main(String[] args) {
		try{
			tempCheck(101);
		}catch(Task2TemperatureOutOfRangeException t1) {
			System.out.println(t1.getMessage());
		}finally {
			System.out.println("from main finally");
		}
	}
	
	public static void tempCheck(int temp) throws Task2TemperatureOutOfRangeException{
		if(temp <= -50 || temp >= 100) {
			throw new Task2TemperatureOutOfRangeException("temperature is out of range");
		}else {
			System.out.println("temp is in range");
		}
	}
}
