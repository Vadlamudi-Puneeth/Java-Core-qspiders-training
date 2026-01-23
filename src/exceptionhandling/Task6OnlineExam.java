package exceptionhandling;

public class Task6OnlineExam {
	static boolean internetConnect = true;
	static boolean timeout = false;
	static boolean file_upload = true;
	
	public static void main(String[] args) {
		try{
			online(true, false, true);
		}catch(Task6InternetDisconnection d) {
			System.out.println(d.getMessage());
		}catch(Task6SessionTimeOut t) {
			System.out.println(t.getMessage());
		}catch(Task6FileUploadFile u) {
			System.out.println(u.getMessage());
		}
	}
	
	public static void online(boolean connection, boolean studentTimeout, boolean file_uploaded) throws Task6InternetDisconnection, Task6SessionTimeOut, Task6FileUploadFile{
		if((connection && internetConnect) && (!studentTimeout &&  !timeout)&& ( file_upload && file_uploaded)) {
			System.out.println("successfully submitted");
		}else if(!internetConnect) {
			throw new Task6InternetDisconnection("Internet disconnected");
		}else if(timeout) {
			throw new Task6SessionTimeOut("session time out");
		}else if(!file_upload) {
			throw new Task6FileUploadFile("file not uploaded");
		}
	}
	
}
