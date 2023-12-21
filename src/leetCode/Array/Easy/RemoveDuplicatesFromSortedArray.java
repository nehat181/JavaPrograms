package leetCode.Array.Easy;

public class RemoveDuplicatesFromSortedArray {
	/*
	 * TC-O(N) SC-O(N)
	 */
	public static int removeDuplicates1(int[] nums) {
		int [] rd=new int[nums.length];
		rd[0]=nums[0];
		int p=0;
		for(int i=1;i<nums.length;i++){
			if(rd[p]!=nums[i]){
				rd[p+1]=nums[i];
				p++;
			}

		}
		return p+1;
	}
	/*
	 * TC-O(N) SC-O(1)
	 */
	public static int removeDuplicates(int[] nums) {

		int p=0;
		for(int i=1;i<nums.length;i++){
			if(nums[p]!=nums[i]){
				nums[p+1]=nums[i];
				p++;
			}

		}
		return p+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] nums= {0,0,1,1,1,2,2,3,3,4}; //5, nums = [0,1,2,3,4,_,_,_,_,_]
		int [] nums= {1,1,2}; //2, nums = [1,2,_]
		System.out.println(removeDuplicates(nums));
	}

}
