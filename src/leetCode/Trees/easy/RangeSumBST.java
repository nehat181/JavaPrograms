package leetCode.Trees.easy;

import leetCode.Trees.TreeNode;

public class RangeSumBST {

	int sum=0;
	public int rangeSumBST(TreeNode root, int low, int high) {
		if(root==null) return 0;
		rangeSumBST(root.left,low,high);
		rangeSumBST(root.right,low,high);
		if(root.val>=low&&root.val<=high){
			sum+=root.val;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(10);
		root.left=new TreeNode(5);
		root.right=new TreeNode(15);
		root.left.left=new TreeNode(3);
		root.left.right=new TreeNode(7);
		root.right.right=new TreeNode(18);

		System.out.println(new RangeSumBST().rangeSumBST(root, 7, 15));


	}

}
