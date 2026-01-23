package filehandling;
import java.io.*;

public class Example {
	public static void main(String[] args) throws IOException {
		//create file using file class
		
		File f = new File("C:/Users/nanip/Desktop/capgemini/class practice");
		f.mkdir();
//	
		File f1 = new File(f,"Sample.java");
		f1.createNewFile();
//		System.out.println(f1.getAbsolutePath());
//		
		File f2 = new File(f, "Example.java");
		f2.createNewFile();
//		System.out.println(f2.getAbsolutePath());
//		
		File f3 = new File(f, "Example2.java");
		f3.createNewFile();		
//		System.out.println(f3.getAbsolutePath());
		
		File[] folder = f.listFiles();
		if(folder != null) {
			for(File file: folder) {
				System.out.println(file.getName());
			}
		}
		
	
	}
}
