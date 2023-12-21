package strings;

import java.util.HashMap;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		int [] num= new int[2];
		int temp=0;
		for(int i=0;i<nums.length;i++){
			temp=target-nums[i];
			if(hm.containsKey(temp)) {
				num[0]=hm.get(temp);
				num[1]=i;
				return num;
			}
			else {
			
				hm.put(nums[i],i );
			}
			
		}

		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {3,3};
		int num[]=(new TwoSum().twoSum(nums,6));
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}

}
