package exceptionhandling;

public class Task10Users {
	public static void main(String[] args) {
		try{
			logged(false, false, false);
		}catch(Task10TokenExpired e) {
			System.out.println(e.getMessage());
		}catch(Task10WrongCredentials wc) {
			System.out.println(wc.getMessage());
		}catch(Task10ServerDown sd) {
			System.out.println(sd.getMessage());
		}
	}
	
	public static void logged(boolean credentials, boolean server_down, boolean expired) throws Task10WrongCredentials, Task10ServerDown, Task10TokenExpired{
		if(credentials && !server_down && !expired) {
			System.out.println("logged in");
		}else if(!credentials) {
			throw new Task10WrongCredentials("credentials required");
		}else if(server_down) {
			throw new Task10ServerDown("server down");
		}else if(expired) {
			throw new Task10TokenExpired("token is expired");
		}
	}
	
}
