package leetCode.Array.Easy;

public class MaximumProductDifferenceBetweenTwoPairs {
	public int maxProductDifference(int[] nums) {

		int firstLargest=0;
		int secondLargest=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>firstLargest){
				secondLargest=Math.max(firstLargest,secondLargest);
				firstLargest=Math.max(firstLargest,nums[i]);
			}
			else
				if(nums[i]>=secondLargest){
					secondLargest=nums[i];
				}   
		}
		int firstMin=Integer.MAX_VALUE;
		int secondMIN =Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++){
			if(nums[i]<firstMin){
				secondMIN=firstMin;
				firstMin=Math.min(nums[i],firstMin);

			}
			else
				if(nums[i]<=secondMIN){
					secondMIN=nums[i];
				}   
		}
		return (firstLargest*secondLargest)-(firstMin*secondMIN);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {5,6,2,7,4};
		System.out.println(new MaximumProductDifferenceBetweenTwoPairs().maxProductDifference(nums));
	}

}
