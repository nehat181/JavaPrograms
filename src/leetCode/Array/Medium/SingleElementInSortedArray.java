package leetCode.Array.Medium;

public class SingleElementInSortedArray {

	public int singleNonDuplicate(int[] nums) {

        int left=0;
        int right=nums.length-1;
        int mid=0;
        if(nums.length==1) return nums[0];
        else
        if(nums[0]!=nums[1]) return nums[0];
        else
        if(nums[right]!=nums[right-1]) return nums[right];          
        while(left<right){
        	mid=(left+right)/2;
            if(nums[mid]!=nums[mid+1]&&nums[mid-1]!=nums[mid]) return nums[mid];
            
           if(mid%2==0){
               if(nums[mid]==nums[mid+1]){
                   left=mid+1;
               }
               else{
                   right=mid;
               }
           }
           else 
           if(mid%2!=0){
               if(nums[mid-1]==nums[mid]){
                   left=mid+1;
               }
               else{
                   right=mid;
               }
           }
           }
      
     return -1; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1,1,2,2,4,6,6};
		System.out.println(new SingleElementInSortedArray().singleNonDuplicate(nums));
	}

}
