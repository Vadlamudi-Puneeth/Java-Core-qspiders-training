package filehandling;
import java.io.*;

public class Example2 {
	public static void main(String[] args) throws IOException{
		File f = new File("C:/Users/nanip/Desktop/capgemini/class practice/Sample.txt");
		f.createNewFile();
		f.delete();
	}
}
