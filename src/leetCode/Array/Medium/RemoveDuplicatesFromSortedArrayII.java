package leetCode.Array.Medium;

public class RemoveDuplicatesFromSortedArrayII {

	public static int removeDuplicates(int[] nums) {
		int start=1;
		int count=1;
		for(int i=1;i<nums.length;i++) {
			if(nums[i]==nums[i-1]) {
				count++;
			}
			else {
				count=1;
			}
			
			if(count<=2) {
				nums[start]=nums[i];
				start++;
			}
			
		}
		return start;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int [] nums = {1,1,1,2,2,3};//1 1 2 2 3 3
			System.out.println(removeDuplicates(nums));
		}

	}
