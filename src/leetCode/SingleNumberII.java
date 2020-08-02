package leetCode;

import java.util.Arrays;

public class SingleNumberII {

	
	public int singleNumber1(int[] nums) {
        
	       Arrays.sort(nums);
	        for(int i=0;i<nums.length;i=i+3){
	        	if(i==nums.length-1) {
	        		return nums[i];
	        		
	        	}
	            if(nums[i]==nums[i+2]) {
	            	
	            }
	            else {
	            	return nums[i];
	            	
	            }
	            if(i>nums.length-2) {
	            	break;
	            }
	        }
	      return 0;  
	    }
	
	public int singleNumber2(int[] A) {
		
		   int ans = 0;
		  for (int i=0;i<32;i++) {
			  int count = 0;
		   for(int j=0;j<A.length;j++) {
				 int b= (A[j]>>i) & 1;
  			   if(((A[j]>>i)&1)==1) {
				   count++;
			   }	  
			  }
		   if(count%3>0) {
			   ans|=(count%3)<<i;
			   
			   
		   }
		   
		  }
		  
		  return ans;
	       
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {0,1,0,1,0,1,99};
		SingleNumberII obj=new SingleNumberII();
		int y=obj.singleNumber2(nums);
		System.out.println(y);
	}

}
