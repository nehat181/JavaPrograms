package leetCode.Trees.easy;

import leetCode.Trees.TreeNode;

public class ConvertSortedArrayToBST {

	public TreeNode sortedArrayToBST(int[] nums) {
		return helper(nums,0,nums.length-1);
	}

	public TreeNode helper(int nums[],int left,int right){

		if(left>right){
			return null;
		}
		int mid=left +(right-left)/2;
		TreeNode root=new TreeNode(nums[mid]);
		root.left=helper(nums,left,mid-1);
		root.right=helper(nums,mid+1,right);
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {-10,-3,0,5,9};
		System.out.println(new ConvertSortedArrayToBST().sortedArrayToBST(nums));

	}

}
