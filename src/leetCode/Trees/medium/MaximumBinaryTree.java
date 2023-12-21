package leetCode.Trees.medium;

import leetCode.Trees.TreeNode;

public class MaximumBinaryTree {
	
	public TreeNode constructMaximumBinaryTree(int[] nums) {
	      return traverse(nums,0,nums.length-1);
	    }

	    public TreeNode traverse(int[] nums,int left,int right) {
	        if(left>right) return null;
	      int index=findMax(nums,left,right);
	      TreeNode root=new TreeNode(nums[index]);       
	      root.left=traverse(nums,left,index-1);
	      root.right=traverse(nums,index+1,right);
	      return root;
	    }
	    
	    public int findMax(int[] nums,int l,int r){
	        int max=l;
	        for(int i=l;i<=r;i++){
	           if( nums[max]<nums[i]){
	            max=i;
	           }
	        }
	       return max;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {3,2,1,6,0,5};
		System.out.println(new MaximumBinaryTree().constructMaximumBinaryTree(nums));
		

	}

}
