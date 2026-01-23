package wrappers;

public class Sample {
	public static void main(String[] args) {
		
//		String s = "123";
//		int a = Integer.parseInt(s);
//		System.out.println((a));
		
//		String s = "123";
//		double d = Double.parseDouble(s);
//		System.out.println(d);
		
//		String s = "234";
//		Integer i = Integer.valueOf(s);
//		System.out.println(i);

		//convert primitive to string type
		int a = 101;
		String s3 = String.valueOf(a);
		System.out.println(s3);
		
		//converting wrapper to string type
		String s4 = Integer.toString(a);
		System.out.println(s4);

	}
}
