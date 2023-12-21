package leetCode.Array.Medium;

public class MaximumSumCircularSubarray {
	public int findKadane(int[] nums){
		int max=Integer.MIN_VALUE;
		int curr=0;
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>curr+nums[i]) {
				curr=nums[i];
			}
			else {
				curr+=nums[i];
			}
			max=Math.max(max, curr);
		}		
		return max;
	}
	public int maxSubarraySumCircular(int[] nums) {
		if(nums.length==1) return nums[0];
		int sum=0;
		int kadaneSum=findKadane(nums);
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			nums[i]=-nums[i];
		}
		int min=findKadane(nums);
		int ans=Math.max(kadaneSum,sum+min);
		ans=Math.max(ans, sum);
		return ans;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] A= {5,-3,5};
		//int [] A= {1,-2,3,-2};
		int [] A= {3,1,3,2,6};
		int val=new MaximumSumCircularSubarray().maxSubarraySumCircular(A);
		System.out.println(val);


	}
}


