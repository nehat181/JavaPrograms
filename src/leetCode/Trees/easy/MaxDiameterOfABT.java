package leetCode.Trees.easy;

import leetCode.Trees.TreeNode;

public class MaxDiameterOfABT {
	
	int res=0;
	 public int diameterOfBinaryTree(TreeNode root) {
		    traverse(root);
		    return res;
    }
	 
	 
	 public int traverse(TreeNode root) {
		 if(root==null) return 0;
		 int lh=traverse(root.left);
		 int rh=traverse(root.right);
		 res=Math.max(res,lh+rh);
		 return 1+Math.max(lh, rh); 
	 }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        System.out.println(new MaxDiameterOfABT().diameterOfBinaryTree(root));
	}

}
