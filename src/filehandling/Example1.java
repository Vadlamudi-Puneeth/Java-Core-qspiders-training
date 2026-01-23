package filehandling;
import java.io.*;

public class Example1 {
	public static void main(String[] args) throws IOException{
		
		File f = new File("C:/Users/nanip/Desktop/capgemini/class practice");
		f.mkdir();
		
		File f1 = new File(f, "Sample.txt");
		f1.createNewFile();
		
//		FileWriter fw = new FileWriter(f1);
//		fw.write("Hello guys.. Good Morning!\n");
//		fw.write("go and sleep");
//		fw.close();
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
//		bw.write("int a = 10;");
//		bw.newLine();
//		bw.write("String name = Dinga;");
//		bw.close();
//		
		
//		FileReader fr = new FileReader(f1);
//		int read;
//		
//		while((read = fr.read()) != -1) {
//			System.out.print((char)read);
//		}
		
		BufferedReader br = new BufferedReader(new FileReader(f1));
		
//		int read; // chars
//		
//		while((read = br.read()) != -1) {
//			System.out.print((char)read);
//		}
		
		String reading; // strings
		while((reading = br.readLine()) != null) {
			System.out.println(reading);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
