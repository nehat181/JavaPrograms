package leetCode;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class KthLargestElementinanArray {

//public int findKthLargest(int[] nums, int k) {
//	int num=0;
//	k=nums.length-k+1;
//	TreeSet<Integer> hs=new TreeSet<Integer>();
//	for(int i:nums) {
//		hs.add(i);
//	}
//	
//	Iterator<Integer> itr=hs.iterator();
//	while(k>0)
//	{
//	num=itr.next();	
//	k--;
//	}
//	
//	return num;
//        
//    }
	
	public int findKthLargest(int[] nums, int k) {
		int num=0;
		int k1=0;
		TreeMap<Integer,Integer> hs=new TreeMap<Integer,Integer>(Collections.reverseOrder());
		
	      for(int i:nums) {
	    	  if(!hs.containsKey(i)) {
	    		  hs.put(i, 1);
	    	  }
	    	  else {
	    		  hs.put(i, hs.get(i)+1);
	    	  }
	      }
	      		
	      for(Map.Entry<Integer, Integer> entry : hs.entrySet()) {
	    	
	    	  if(k1>=k) {break;}
	    		 
	    		 num=entry.getKey();
	    		 k1+=entry.getValue();
	    	  
	    	  
	      }
	      
		
		
		return num;
	        
	    }
	
	
	public static int findPriorityQueue(int[] nums, int k) {
	
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			pq.add(nums[i]);
		}
		
		for(int j=k;j<nums.length;j++) {
			
			if(nums[j]>pq.peek()) {
				pq.poll();
				pq.add(nums[j]);
			}
			
		}
		
		
	      
		
		
		return pq.peek();
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {3,2,1,5,6,4};
		int k=2;
//		int [] nums= {3,2,3,1,2,4,5,5,6};
//		int k=4;
//		int [] nums= {3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
//		int k=20;
		
	//	int num=new KthLargestElementinanArray().findKthLargest(nums, k);
	int num=findPriorityQueue(nums, k);
		System.out.println(num);

	}

}
