package leetCode.Array.Medium;

import java.util.HashMap;

public class ContinuousSubarraySum {

	public boolean checkSubarraySum(int[] nums, int k) {

		int sum=0;
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
			int rem=sum%k;
			if(rem==0) {
				if(i>=1) return true;
			}
			if(!hm.containsKey(rem)) {
				hm.put(rem,i);
			}
			else{
				int index=hm.get(rem);
				if(i-index==1) continue;
				return true;
			}



		}
		return false;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] nums= {23,2,6,4,7};
		//int k=13;
//		int [] nums= {23,2,4,6,6};
//		int k=7;
		int [] nums= {2,4,3};
		int k=6;
		System.out.println(new ContinuousSubarraySum().checkSubarraySum(nums, k));
	}

}
