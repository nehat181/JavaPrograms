package leetCode.Array.Medium;

public class SearchInRotatedArray {

	public int search(int[] nums, int target) {
    	int l=0;
		int r=nums.length-1;
		int mid=0;
		while(l<=r){
			mid=(l+r)/2;

			if(nums[mid]==target){
				return mid;
			}
			else if(nums[mid]>=nums[l]){// check if left is sorted array
				if(nums[mid]>target&&nums[l]<=target){// check if target is in left sorted array
					r=mid-1;
				}
				else{
					l=mid+1;
				}
			}

			else {
// when right is the sorted array
				if(nums[mid]<target&& nums[r]>=target) {//check if target is in right sorted array
					l=mid+1;
				}
				else {
					r=mid-1;
				}
			}

		}
		return -1;
	}
//1 2 3 4 5---5 4 1 2 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {4,5,6,7,0,1,2}; //4
		int target=0;
		//		int [] nums= {1,3}; //4
		//		int target=3;
		System.out.println(new SearchInRotatedArray().search(nums, target));
	}

}
