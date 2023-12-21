package leetCode.Array.Medium;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MaximumSumOfDistinctSubArraysLenK {

	
	public long maximumSubarraySum1(int[] nums, int k) {
		Set<Integer> hs = new HashSet<>();
	    long max = 0, sum = 0;
	    int start=0;
	     for(int i=0;i<nums.length;i++){
	         while(hs.contains(nums[i])||hs.size()==k){
	             sum-=nums[start];
	             hs.remove(nums[start]);
	             start++;
	         }
	         sum+=nums[i];
	         hs.add(nums[i]);
	         if(hs.size()==k) {
	             max=Math.max(sum,max);
	         }


	   }
	   return max;
   }

	
    public long maximumSubarraySum(int[] nums, int k) {
    	 long max=0;
	      int start=0;
	      long sum=0;
	      
	      HashSet<Integer> numberSet = new HashSet<>();   // Set to store the distinct elements in the window
	        for (int i = 0; i < nums.length; i++) {
	            sum += nums[i];  //  Adding it to the sum

	            //  If the addition of the element fails, we slide the window forward until we are able to add, remove the element from the set
	            //  and reduce it's value from the current sum 
	            while (!numberSet.add(nums[i])) {  
	                 sum -= nums[start];
	                numberSet.remove(nums[start]);
	                start++;
	            }
	            // We update the max if and only if the window size if equal to the limit specified
	            // The window is also slid forward and operations repeated as specified above 
	            if (i - start == k - 1) {
	                max = Math.max(max, sum);
	                sum -= nums[start];
	                numberSet.remove(nums[start]);
	                start++;
	            }
	        }
	       return max;
    }
    
    
    
	public static void main(String[] args) {
		
		int[] nums= {1,5,4,2,9,9,9};
		int k=3;
		System.out.println(new MaximumSumOfDistinctSubArraysLenK().maximumSubarraySum(nums, k));
	}
}
