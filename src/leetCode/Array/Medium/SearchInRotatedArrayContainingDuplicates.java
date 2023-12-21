package leetCode.Array.Medium;

public class SearchInRotatedArrayContainingDuplicates {
	
	 public boolean search(int[] nums, int target) {
	       int left=0;
	       int right=nums.length-1;
	       int mid=0;
	       while(left<=right){
	           mid=(left+right)/2;
	           if(nums[mid]==target){
	               return true;
	           }
	           else if(nums[left]==nums[right]&&nums[left]!=target){
	               left++;
	               right--;
	           }
	           else if(nums[left]==nums[right]&&nums[left]==target){
	            return true;
	           }
	           else if(nums[left]<=nums[mid]){
	               if(nums[mid]>target&&nums[left]<=target){
	                   right=mid-1;
	               }
	               else{
	                   left=mid+1;
	               }
	           }
	           else if(nums[mid]<target&&nums[right]>=target){ 
	               left=mid+1;
	           }
	           else{
	               right=mid-1;
	           }
	           
	       } 

	       return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int [] nums= {2,5,6,0,0,1,2};
  int target=0;
  System.out.println(new SearchInRotatedArrayContainingDuplicates().search(nums, target));
	}

}
