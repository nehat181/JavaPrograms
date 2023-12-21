package leetCode.Array.Medium;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
	/*
	 * Given an integer array of size n, find all elements that appear more than ⌊
	 * n/3 ⌋ times.
	 * 
	 * using moore's voting algo
	 */

	public static List<Integer> majorityElement(int[] nums){
		List<Integer> li=new ArrayList<>();
		int count1=1;
		int ele1=nums[0];
		int count2=0;
		int ele2=nums[0];

		for(int i=1;i<nums.length;i++){
			if(nums[i]==ele1){
				count1++;
			}
			else if(nums[i]==ele2){
				count2++;
			}
			else
				if(count1==0){
					ele1=nums[i];
					count1=1;
				}
				else 
					if(count2==0){
						ele2=nums[i];
						count2=1;
					}
					else {
						count1--;
						count2--;
					}
		}
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==ele1)count++;
		}
		if(count>nums.length/3) li.add(ele1);
		count=0;
		if(ele1!=ele2) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==ele2)count++;
		}
		}
		if(count>nums.length/3) li.add(ele2);
		return li;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1};
		System.out.println(majorityElement(nums));
	}

}
