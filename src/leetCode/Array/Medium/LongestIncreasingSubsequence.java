package leetCode.Array.Medium;

public class LongestIncreasingSubsequence {
	public int lengthOfLIS(int[] nums) {
		int [] arr=new int[nums.length];
		arr[0]=nums[0];
		int index=0;
		for(int i=1;i<nums.length;i++){
			if(nums[i]<arr[index]){
				int low=0;
				int high=index;
				while(low<=high){
					int mid=(low+high)/2;
					if(arr[mid]<nums[i]){
						low=mid+1;
					}
					else{
						high=mid-1;
					}
				}
				arr[low]=nums[i];

			}
			else
				if(arr[index]!=nums[i]){
					index++;
					arr[index]=nums[i];
				}

		}
		return index+1;  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {10,9,2,5,3,7,101,18};
		System.out.println(new LongestIncreasingSubsequence().lengthOfLIS(nums));
	}

}
