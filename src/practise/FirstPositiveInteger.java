package practise;
import java.util.*;

public class FirstPositiveInteger {
	 public int firstMissingPositive(int[] arr) {
	        Arrays.sort(arr);
	        int expected = 1;
	        for(int i = 0;i < arr.length; i++) {
	        	if(arr[i] == expected) {
	        		expected++;
	        	}
	        }
	        
	        return expected;
	       
	    }
	 
	 public static void main(String[] args) {
		 int arr[] = {1,7,8,9,11,12};
		 FirstPositiveInteger p = new FirstPositiveInteger();
		 int res =  p.firstMissingPositive(arr);
		 
		 System.out.println("\n" + res);
	}
}
