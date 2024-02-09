package leetCode.Array.Medium;

public class MaxConsecutiveOnesIII {

	public int longestOnes(int[] nums, int k) {
		
		int currZero=0;
		int max=0;
		int start=0;
		int end=0;
		
		while(end<nums.length) {
			if(nums[end]==0) {
				currZero++;
			}
			end++;
			while(currZero>k) {
				if(nums[start]==0) {
					currZero--;
				}
				start++;
			}
			max=Math.max(max, end-start);
			
		}
		
		
		return max;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1,1,1,0,0,0,1,1,1,1,0};
		int k=2;
		System.out.println(new MaxConsecutiveOnesIII().longestOnes(nums, k));
	}

}
