package leetCode.Array.Easy;

public class MonotonicArray {
	
	public static boolean isMonotonic(int[] nums) {
		boolean increasing = true;
        boolean decreasing = true;
		
		for(int i=1;i<nums.length;i++) {	
			if(nums[i]>nums[i-1]) {
				decreasing = false;
			
				
			}
			else {
				if(nums[i]<nums[i-1]) {
					increasing = false;
				}
				
			}
		}
		return increasing || decreasing;
		
	}
	
	public static boolean isMonotonic1(int[] nums) {
		if(nums[0]<nums[nums.length-1]) {
			for(int i=1;i<nums.length;i++) {
				if(nums[i]<nums[i-1]) {
					return false;
				}
			}
		}
			else {
				for(int i=1;i<nums.length;i++) {
					if(nums[i]>nums[i-1]) {
						return false;
					}
			}
		}
		return true;
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] nums = {1,2,2,3};
     System.out.println(isMonotonic1(nums));
	}

}
