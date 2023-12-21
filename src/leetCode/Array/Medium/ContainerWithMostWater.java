package leetCode.Array.Medium;

public class ContainerWithMostWater {

	public static int maxAreaOptimized(int[] height) {
		int max=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        
        while(left<right){
            int curr=Math.min(height[left],height[right])*(right-left);
            max=Math.max(curr,max);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }

        }
       
       return max;
    }
	public static int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int curr=1;
        for(int i=0;i<height.length-1;i++) {
        	for(int j=i+1;j<height.length;j++) {
        		curr=Math.min(height[i], height[j])*(j-i);
        		max=Math.max(max, curr);
        	}
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1,8,6,2,5,4,8,3,7};
		System.out.println(maxAreaOptimized(nums));

	}

}
