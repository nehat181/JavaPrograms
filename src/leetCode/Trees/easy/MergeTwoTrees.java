package leetCode.Trees.easy;

import leetCode.Trees.TreeNode;

public class MergeTwoTrees {
	
	 public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		 if(root1==null) return root2;
	        if(root2==null) return root1;
	        
          TreeNode sum=new TreeNode(root1.val+root2.val);
	         sum.left=mergeTrees(root1.left, root2.left);
	         sum.right=mergeTrees(root1.right, root2.right);
	        return sum;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(3);
		root.right=new TreeNode(2);
		root.left.left=new TreeNode(5);
		
		TreeNode root1=new TreeNode(2);
		root1.left=new TreeNode(1);
		root1.right=new TreeNode(3);
		root1.left.right=new TreeNode(4);
		root1.right.right=new TreeNode(7);
		
		System.out.println(mergeTrees(root, root1));
		
	}

}
