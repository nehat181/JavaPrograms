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


	public int maxProduct1(int[] nums) {
		int max=Integer.MIN_VALUE;
	    int curr=1;
	    for(int i=0;i<nums.length;i++) {
	    	curr*=nums[i];
	    	max=Math.max(max, curr);
	        if(curr==0) curr=1;
	    }
	    curr=1;
	    for(int i=nums.length-1;i>=0;i--) {
	    	curr*=nums[i];
	    	max=Math.max(max, curr);
	    	if(curr==0) curr=1;
	    }
		return max;
	}
	
	public int maxProduct2(int[] nums) {
		int max=nums[0];
	    int min=nums[0];
	    int ans=nums[0];
	    
	    for(int i=1;i<nums.length;i++) {
	    	
	    	if(nums[i]<0) {
	     		int temp=min;
	     		min=max;
	     		max=temp;
	     	}
	     	max=Math.max(nums[i], max*nums[i]);
	     	min=Math.min(nums[i], min*nums[i]);
	     	
	     	
	     	ans=Math.max(ans, max);
	     	
	    	
	    	
	    }
		return ans;
	}

	public static void main(String[] args) {
		// TODO Autoenerated method stub
		int [] nums= {2,3,-2,4};


		int max=new MaximumProductSubarray().maxProduct2(nums);
		System.out.println(max);



	}
}


