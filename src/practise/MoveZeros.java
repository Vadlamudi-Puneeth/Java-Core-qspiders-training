package practise;
import java.util.*;

public class MoveZeros {
	    public void moveZeroes(int[] nums) {

	        int index = 0;
	        int arr[] = new int[nums.length];
	        
	        for(int i = 0;i < nums.length; i++){
	            if(nums[i] != 0){
	                arr[index++] = nums[i];
	            }
	        }

	        for(int i = 0;i < arr.length; i++) {
	        	System.out.print(arr[i] + " ");
	        }


	    }
	    
	    public static void main(String[] args) {
	    	MoveZeros m = new MoveZeros();
	    	int []arr = {0,1,0,3,12};
	    	m.moveZeroes(arr);
		}
	
}
