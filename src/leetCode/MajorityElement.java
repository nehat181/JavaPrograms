package leetCode;

public class MajorityElement {

	/*
	 * The majority element is the element that appears more than ⌊n / 2⌋ times. You
	 * may assume that the majority element always exists in the array.
	 * 
	 * Moore's Voting Algorithm
	 * 
	 */
	

	public static int majorityElement(int[] nums) {

		int count=1;
		int ele=nums[0];
		for(int i=1;i<nums.length;i++) {
			if(count==0) {
				ele=nums[i];
			}
			if(nums[i]==ele) {
				count++;
			}
			else {
				count--;
			}
			
			
		}
		return ele;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num= {2,2,1,1,1,2,2};
		System.out.println(majorityElement(num));

	}

}
