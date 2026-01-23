package week2;
import java.util.*;

public class AutomorphicNumber {
	public static void main(String args[]) {
		int n = 6;
		int org = n;
		int pow = (int)Math.pow(n, 2);
		
		int count = 0;
		while(n != 0) {
			n/=10;
			count++;
		}
		
		System.out.println(pow%(int)Math.pow(10, count));
		
		if(pow%(int)Math.pow(10, count) == org) {
			System.out.println("Automorphic");
		}else {
			System.out.println("Not Automorphic");
		}
		
	}
}
