package leetCode.Array.Medium;

public class LongestSubarrayof1AfterDeletingOneElement {

	public int longestSubarray(int[] nums) {
    int zeroes=0;
    int maxWindow=0;
    int start=0;
    for(int i=0;i<nums.length;i++) {
    	if(nums[i]==0) {
    		zeroes++;
    	}
    	if(zeroes>1) {
    		if(nums[start]==0) {
    			zeroes--;
    		}
    		start++;
    	}
    	maxWindow=Math.max(maxWindow, i-start);
    }
    
    return maxWindow;
    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {0,1,1,1,0,1,1,0,1};
		System.out.println(new LongestSubarrayof1AfterDeletingOneElement().longestSubarray(nums));
	}

}
