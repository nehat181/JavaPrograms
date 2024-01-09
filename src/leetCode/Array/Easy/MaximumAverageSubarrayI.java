package leetCode.Array.Easy;

public class MaximumAverageSubarrayI {

	public double findMaxAverage(int[] nums, int k) {
		double avg=0;
		int start=0;
		double sum=0;

		for(int i=0;i<k;i++){
			sum+=nums[i];
		}
		avg=sum/k;
			for(int i=k;i<nums.length;i++){
			sum-=nums[start];
			sum+=nums[i];
			avg=Math.max(avg,sum/k);
			start++;
		}
		return avg;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {1,12,-5,-6,50,3};
		int k = 4;
		System.out.println(new MaximumAverageSubarrayI().findMaxAverage(nums, k));
				
	}

}
