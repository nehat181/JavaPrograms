package leetCode.Array.Medium;

public class FindFirstAndLastPositionOfElementInSortedArray {

	public int[] searchRange(int[] nums, int target) {
		int[] ans=new int[2];
		if(nums.length==0) {
			ans[0]=-1;
			ans[1]=-1;
		}
		else {
			ans[0]=getFirstOcc(nums,target);
			ans[1]=getLastOcc(nums, target);
		}
		return ans;		
	}

	public int getFirstOcc(int[] nums, int target) {
		int l=0;
		int r=nums.length-1;
		int mid=0;       
		while(l<=r){
			mid=(l+r)/2;
			if((mid==0||nums[mid-1]<target)&&nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]<target) {
				l=mid+1;
			}
			else {
				r=mid-1;
			}

		}
		return -1;
	}

	public int getLastOcc(int[] nums, int target) {
		int l=0;
		int r=nums.length-1;
		int mid=0;
		while(l<=r){
			mid=(l+r)/2;
			if((mid==nums.length-1||nums[mid+1]>target)&&nums[mid]==target){
				return mid;
			}
			else if(nums[mid]<=target){
				l=mid+1;
			}
			else if(nums[mid]>target){
				r=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {5,7,7,8,8,10};
		int target=6;
		System.out.println(new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums,target));
	}

}
