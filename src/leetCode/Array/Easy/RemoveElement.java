package leetCode.Array.Easy;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int start=0;
		int count=0;
		int end=nums.length-1;
		while(start<end){
			if(nums[start]==val&&nums[end]!=val){
				nums[start]=nums[end];
				nums[end]=val;
				start++;
			}else
				if(nums[start]!=val){
					start++;
				}
				else
					end--;
		}
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=val){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {3,2,2,3};
		int val = 3;
		System.out.println(new RemoveElement().removeElement(nums,val));
	}

}
