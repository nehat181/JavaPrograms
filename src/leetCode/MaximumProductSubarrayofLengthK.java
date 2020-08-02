package leetCode;

public class MaximumProductSubarrayofLengthK {
	
	 public int maxProduct(int[] nums) {
		 
		  int first=Integer.MIN_VALUE;
	        int second=Integer.MIN_VALUE;
	        int third=Integer.MIN_VALUE;
	       int thirdmin=Integer.MAX_VALUE;
	       int secmin=Integer.MAX_VALUE;
	        int max=0;
	        for(int i=0;i<nums.length;i++){
	            
	        	if(first<nums[i]) {
	        		third=second;
	        		second=first;
	        		first=nums[i];
	        	}	        
	        	
	        	else
       
	        	if(second<nums[i]) {
	        		third=second;
	        		second=nums[i];
	        	}
	        	else
	        		
	        	if(third<nums[i]) {
	        		third=nums[i];
	        	}
	        	
	        
         
         
         
         
       
	            
	        	if(nums[i]<secmin) {
	        		
	        		thirdmin=secmin;
	        		secmin=nums[i];
	        	}
	       
	        	else if(nums[i]<thirdmin) {
	        		thirdmin=nums[i];
	        	}
	        	
	        } 
	        
	      
         
	       
         int prodmin=first*second*third;
         int prodmax=first*secmin*thirdmin;
	      
          return prodmin>prodmax?prodmin:prodmax;
		 
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1,2,3,2};
		
		int max=new MaximumProductSubarrayofLengthK().maxProduct(nums);
		System.out.println(max);
	}

}
