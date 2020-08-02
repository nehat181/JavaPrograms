package leetCode;

import java.util.HashMap;
import java.util.Map;

public class FindMajorityElement {
	
	public static int majorityElement(int [] nums) {
		int output=0;
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			if(hm.containsKey(nums[i]))
			
			{
				
				hm.put(nums[i], hm.get(nums[i])+1);
			}
			
			else {
				hm.put(nums[i], 1);
			}
		}
		
		
	for(Map.Entry<Integer, Integer> entry:hm.entrySet()) {
	int value=entry.getValue();
	
	if (value>nums.length/2) {
		output=entry.getKey();
	}
	}	
	
		
		return output;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {2,2,1,1,1,2,2};
	System.out.println(	majorityElement(nums));
		

	}

}
