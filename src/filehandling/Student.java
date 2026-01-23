package filehandling;
import java.io.*;

public class Student implements Serializable{
	int sid;
	String sname;
	
	Student(int sid, String sname){
		this.sid = sid;
		this.sname = sname;
	}
	
}
