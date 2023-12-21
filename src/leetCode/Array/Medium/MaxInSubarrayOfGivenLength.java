package leetCode.Array.Medium;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.PriorityQueue;

public class MaxInSubarrayOfGivenLength {
	public static int[] maxSlidingWindow(int[] nums, int k) {
	     int [] ans=new int[nums.length-k+1];
	     int start=0;
	     int end=k;
	     int max=nums[0];
	     if(k==1) {   	
	    	 return nums;
	     }
     HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
     for(int i=0;i<k;i++) {
    	 hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
     }
     while(end<=nums.length) {
    	 max=Collections.max(hm.keySet());
   	 ans[start]=max;
    	 if(hm.get(nums[start])>1) {
    	 hm.put(nums[start],hm.get(nums[start])-1);
    	 }
    	 else
    		 hm.remove(nums[start]); 
    	 if(end==nums.length)break;
    	 hm.put(nums[end], hm.getOrDefault(nums[end],0)+1);;
    	 start++;
    	 end++;
    	
    	 
     }
	     return ans;
	     
	    }
	
	public static int[] findMaximumInSubarrayPriorityQueue(int[] nums, int k) {
		
		  int [] ans=new int[nums.length-k+1];
		  int start=0;
		  PriorityQueue<Integer> dq=new PriorityQueue<Integer>(Collections.reverseOrder());
		 for(int i=0;i<k;i++) {
			 dq.add(nums[i]);
		 }
		 
		for(int j=k;j<=nums.length;j++) {
			ans[j-k]=dq.peek();
			if(j==nums.length)break;
			dq.remove(nums[start]);
			dq.add(nums[j]);
			start++;
			
		}
	        return ans;
	}
	
	public static int[] findMaximumInSubarraydeque(int[] nums, int k) {
		 Deque<Integer> dq= new ArrayDeque<>();
	        int start=0;
	        int end=0;
	        int[] ans=new int[nums.length-k+1] ;
	        for(int i=0;i<nums.length;i++){

	           while(dq.size()>0&&dq.getLast()<nums[end]){
	               dq.removeLast();
          } 
	           dq.addLast(nums[end]);
	           if(end-start+1<k){ 
	               end++;
	           }

	           else{
	            ans[start]=dq.peekFirst();
	            if(nums[start]==dq.peekFirst()){
	                dq.removeFirst();
	            }
	            start++;
	            end++;

	           }

	        }
	        return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1,3,-1,-3,5,3,6,7};//{9,10,9,-7,-4,-8,2,-6};
		int k=3;//5;
		//int[] ans=maxSlidingWindow(nums, k);
		//int[] ans=findMaximumInSubarrayPriorityQueue(nums,k);
		int[] ans=findMaximumInSubarraydeque(nums,k);
		for(int i:ans) {
			System.out.print(i+",");
		}
	}

}
