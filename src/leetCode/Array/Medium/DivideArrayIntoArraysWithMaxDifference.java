package leetCode.Array.Medium;

import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {
	
	public int[][] divideArray(int[] nums, int k) {
		Arrays.sort(nums);
        int[][] ans=new int[nums.length/3][3];
        int index=0;
        for(int i=0;i<nums.length-2;i+=3){
            if(nums[i+1]-nums[i]<=k&&nums[i+2]-nums[i]<=k)
            {
               
                    ans[index][0]=nums[i];
                    ans[index][1]=nums[i+1];
                    ans[index][2]=nums[i+2];
                    index++;  
            }
            else{
                return new int[0][0];
            }
     }
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] nums = {1,3,4,8,7,9,3,5,1};
//		int k = 2;
		int [] nums = {15,13,12,13,12,14,12,2,3,13,12,14,14,13,5,12,12,2,13,2,2};
		int k = 2;
		System.out.println(new DivideArrayIntoArraysWithMaxDifference().divideArray(nums, k));
		
	}

}
