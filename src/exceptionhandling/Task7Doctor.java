package exceptionhandling;

public class Task7Doctor {
	
	static int arr[] = {101,102,103,104};
	
	public static void main(String[] args) {
		try{
			records(101, true);
		}catch(Task7PatentDontExist p) {
			System.out.println(p.getMessage());
		}catch(Task7DatabaseFailed d) {
			System.out.println(d.getMessage());
		}
	}
	
	public static void records(int patientId, boolean connect_fails) throws Task7PatentDontExist, Task7DatabaseFailed{
		boolean patientIdExist = false;
		for(int i: arr) {
			if(i == patientId) {
				patientIdExist = true;
			}
		}
		
		if(patientIdExist && !connect_fails) {
			System.out.println("record found");
		}else if(!patientIdExist) {
			throw new Task7PatentDontExist("patient does not exist");
		}else if(connect_fails) {
			throw new Task7DatabaseFailed("Database not connected");
		}
		
	}
	
}
