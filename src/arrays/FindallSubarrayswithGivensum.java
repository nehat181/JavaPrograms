package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindallSubarrayswithGivensum {
	
	
	public List<List<Integer>> getSubarray(int [] arr,int curr){
		
		List<List<Integer>>li=new ArrayList<List<Integer>>();
		List<Integer> li2;
		int sum=0;
	    int start=0;
	    int end=0;
	 
	    HashMap<Integer,Integer> hm=new HashMap<>();
	    
	    for(int i=0;i<arr.length;i++) {
	    	sum+=arr[i];
	    if(hm.containsKey(sum-curr)) {
	    	li2=new ArrayList<>();
	    	for(int j=hm.get(sum-curr)+1;j<=i;j++) {
	    	 
	    	li2.add(arr[j]);
	    }
	    	li.add(li2);
	    	
	    }
	    else {
	    	hm.put(sum, i);
	    }
	    }
	    
	    
	   System.out.println(li); 
	    
		
		return li;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,-2,-1,-1,2,-1,3,-2,-1};
		
		// 1 3  10 8 7 6 8 7 10 8 7
		List<List<Integer>>li=new ArrayList<List<Integer>>();
		int sum=0;
		li =new FindallSubarrayswithGivensum().getSubarray(arr,sum);
		
		System.out.println(li);
	}

	
	// 1 3 6 10 8 7 6 8 7 10 8 
}
