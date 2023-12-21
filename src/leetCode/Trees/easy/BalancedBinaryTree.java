package leetCode.Trees.easy;

import leetCode.Trees.TreeNode;

public class BalancedBinaryTree {

	boolean flag=true;
	public boolean isBalanced(TreeNode root) {
		helper(root);
		return flag;
	}

	public int helper(TreeNode root){
		if(root==null) return 0;
		int dl=helper(root.left);
		int dr=helper(root.right);
		if(Math.abs(dl-dr)>1) {
			flag=false;
		}
		return 1+Math.max(dl,dr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		System.out.println(new BalancedBinaryTree().isBalanced(root));
	}

}
