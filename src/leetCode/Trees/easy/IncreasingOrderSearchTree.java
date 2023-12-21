package leetCode.Trees.easy;

import leetCode.Trees.TreeNode;

public class IncreasingOrderSearchTree {

	TreeNode ans=new TreeNode(0);
	TreeNode out=ans;
	public TreeNode increasingBST(TreeNode root) {
		traverse(root);
		TreeNode a=ans.right;
		while(a!=null) {
			System.out.println(a.val);
			a=a.right;
		}
		
		return ans.right;

	}

	public void traverse(TreeNode root) {

		if(root==null) return;
		traverse(root.left);
		if(out==null){
			out=new TreeNode(root.val);
			//ans=out;
		}
		else{
			out.right=new TreeNode(root.val);
			out=out.right;
		}
		traverse(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(3);
		root.right=new TreeNode(6);

		root.left.left=new TreeNode(2);
		root.left.right=new TreeNode(4);
		root.left.left.left=new TreeNode(1);

		root.right.right=new TreeNode(8);
		root.right.right.left=new TreeNode(7);
		root.right.right.right=new TreeNode(9);
		
		System.out.println(new IncreasingOrderSearchTree().increasingBST(root));

	}

}
