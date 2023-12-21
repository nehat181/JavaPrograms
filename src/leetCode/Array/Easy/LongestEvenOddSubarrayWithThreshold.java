package leetCode.Array.Easy;

public class LongestEvenOddSubarrayWithThreshold {

	public int longestAlternatingSubarray(int[] nums, int threshold) {
		int ans=0;
		
		return ans; 
	}

	public int longestAlternatingSubarray1(int[] nums, int threshold) {
		int ans=0;
		for(int i=0;i<nums.length;i++)	{
			int c=0;
			if(nums[i]%2==0&&nums[i]<=threshold) {
				c=1;
				for(int j=i+1;j<nums.length;j++) {
					if(nums[j]>threshold||nums[j]%2==nums[j-1]) break;
					c++;
				}
			}
			ans=Math.max(ans, c);
		}
		return ans; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {3,2,5,4}; int threshold = 5;
		System.out.println(new LongestEvenOddSubarrayWithThreshold().longestAlternatingSubarray(nums, threshold));
	}

}
