package leetCode.Trees.easy;

import leetCode.Trees.TreeNode;

public class SumOfTwoLeaves {
	
	 public int sumOfLeftLeaves(TreeNode root) {
	        int sum=0;
	        if(root==null) return 0;
	        if(root.left!=null) {
	        	if(root.left.left==null&&root.left.right==null) {
	        		sum+=root.left.val;
	        	}
	        	else {
	        		sum+=sumOfLeftLeaves(root.left);
	        	}
	        }
	        	sum+=sumOfLeftLeaves(root.right);
	        
	        return sum;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          TreeNode root=new TreeNode(3);
          root.left=new TreeNode(9);
          root.right=new TreeNode(20);
          root.right.left=new TreeNode(15);
          root.right.right=new TreeNode(7);
          
          System.out.println(new SumOfTwoLeaves().sumOfLeftLeaves(root));
	}

}
