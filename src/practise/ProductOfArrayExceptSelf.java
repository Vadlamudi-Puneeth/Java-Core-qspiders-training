package practise;

public class ProductOfArrayExceptSelf {
	 public int[] productExceptSelf(int[] nums) {

	        int arr[] = new int[nums.length];

	        int zeroCount = 0;

	        for(int i: nums){
	        	if(i == 0)
	        		zeroCount+=1;
	        }
	        
//	        System.out.println(zeroCount);

	        int product = 1;
	        for(int i = 0;i < nums.length; i++){
	        	if(nums[i] != 0) {	        		
	        		product *= nums[i];
	        	}
	        }

	        System.out.println(product);
	        if(zeroCount == 0){
	        	int index = 0;
	            for(int i = 0;i < arr.length; i++){
	                arr[index++] = product / nums[i];
	            }
	            return arr;
	        }else if(zeroCount == 1) {
	        	for(int i = 0;i < arr.length; i++) {
	        		if(nums[i] == 0) {
	        			arr[i] = product;
	        		}
	        	}
	        	return arr;
	        }
	        
	    return arr;
	    }
	 
	 public static void main(String[] args) {
		 int arr[] = {-1,1,0,-3,3};
		 ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();
		 int arr1[] = p.productExceptSelf(arr);
		 
		 for(int i: arr1) {
			 System.out.print(i + " ");
		 }
	}
	 
}
