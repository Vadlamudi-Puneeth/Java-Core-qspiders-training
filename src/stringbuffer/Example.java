package stringbuffer;

public class Example {
	public static void main(String[] args) {
		StringBuffer bf = new StringBuffer(); // init capacity is 16
//		bf.append("hi jjjjjhnsefjniuyjkljliujjkhjjfwnfwfnwn");
//		System.out.println(bf.length());
//		System.out.println(bf.capacity());
		//capacity()
//		System.out.println(bf.capacity());
		
		//length()
//		System.out.println(bf.length());
		
		//append()
		bf.append("hi nani");
//		System.out.println(bf);
		
		//insert()
//		bf.insert(2, "ji");
		System.out.println(bf);
		
		//reverse()
//		System.out.println(bf.reverse());
		
		// charAt()
//		System.out.println(bf.charAt(1));
		
		// indexOf()
//		System.out.println(bf.indexOf("n"));
		
		// lastIndexOf()
//		System.out.println(bf.lastIndexOf("n"));
		
		// delete()
		bf.delete(2, 3);
		
		// delteCharAt()
		bf.deleteCharAt(2);
		
		// replace
		bf.replace(1, 2, "nani");
		//setCharAt
		
		bf.setCharAt(2, 'd');
		
		
	}
}
