package leetCode.Trees.easy;

import leetCode.Trees.TreeNode;

public class PathSum {

	int sum=0;
	boolean flag=false;
	public boolean hasPathSum(TreeNode root, int targetSum) {
		traverse(root,targetSum,sum);
		return flag;
	}


	public void traverse(TreeNode root, int targetSum,int sum) {
		if(root==null) return ;
		sum+=root.val;
		if(root.left==null&&root.right==null&&sum==targetSum) {
			flag=true;
			return;
		}
		traverse(root.left,targetSum,sum);
		traverse(root.right,targetSum,sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(4);
		root.right=new TreeNode(8);

		root.left.left=new TreeNode(11);
		root.left.left.left=new TreeNode(7);
		root.left.left.right=new TreeNode(2);

		root.right.left=new TreeNode(13);
		root.right.right=new TreeNode(4);
		root.right.right.right=new TreeNode(1);

		System.out.println(new PathSum().hasPathSum(root, 22));
	}

}
