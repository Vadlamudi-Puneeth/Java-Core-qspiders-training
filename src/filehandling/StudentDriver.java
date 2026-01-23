package filehandling;

import java.io.*;

public class StudentDriver {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Student s = new Student(101, "nani");
		
		//to convert java object to byte code
		FileOutputStream fos = new FileOutputStream("student.txt"); // we can pass file also not only direct string
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s);
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student ss = (Student)ois.readObject();
		System.out.println(ss.sid);
		System.out.println(ss.sname);
		System.out.println(ss);
	}
}
