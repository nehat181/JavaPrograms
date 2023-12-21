package leetCode.Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> res=new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(i>0&&nums[i]==nums[i-1]) continue;
			int j=i+1;
			int k=nums.length-1;
			
			while(j<k) {
				int sum=nums[i]+nums[j]+nums[k];
				if(sum==0) {
					List<Integer> li=new ArrayList<>();
					li.add(nums[i]);
					li.add(nums[j]);
					li.add(nums[k]);
					res.add(li);
					j++;
					k--;
					while(j<k&&nums[j]==nums[j-1]) {
						j++;
					}
					while(j<k&&nums[k]==nums[k+1]) {
						k--;
					}
				}

				else if(sum<0) {
					j++;
				}
				else {
					k--;
				}

			}
		}
		return res;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] nums= {-1,0,1,2,-1,-4};
		//int [] nums= {0,0,0,0};
		System.out.println(new ThreeSum().threeSum(nums));
		String s="geeks";
		System.out.println(s.substring(2));
	  
	}

}
