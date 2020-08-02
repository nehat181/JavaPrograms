package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class MaximumProductSubarray {
	
	
	 public int maxProduct(int[] nums) {
		 int globalmin=nums[0];
		 int globalmax=nums[0];
		 int curr;
		 int maxproduct=globalmax;
		 int prevmin;
		 int prevmax;
		 
		 for(int i=1;i<nums.length;i++) {
			 
			 curr=nums[i];
			 prevmin=curr*globalmin;
			 prevmax=curr*globalmax;
			 
			 if(prevmin>=prevmax&&prevmin>=curr) {
				 
				 globalmax=prevmin;
			 }
			 
           if(prevmax>=prevmin&&prevmax>=curr) {
				 
				 globalmax=prevmax;
			 }
           
           if(curr>=prevmin&&curr>=prevmax) {
				 
				 globalmax=curr;
			 }
           
           
			 if(prevmin<=prevmax&&prevmin<=curr) {
				 
				 globalmin=prevmin;
			 }
			 
         if(prevmax<=prevmin&&prevmax<=curr) {
				 
        	 globalmin=prevmax;
			 }
         
         if(curr<=prevmin&&curr<=prevmax) {
				 
        	 globalmin=curr;
			 }
         
         if(maxproduct<globalmax) {
        	 maxproduct=globalmax;
         }
         

                 
           
				
			
		 }
		 
		 
		return maxproduct;
		 
		 
	 }

	public static void main(String[] args) {
		// TODO Autoenerated method stub
    int [] nums= {2,3,-2,4};
//		
	int max=new MaximumProductSubarray().maxProduct(nums);
	System.out.println(max);
  	
	
	}
}


