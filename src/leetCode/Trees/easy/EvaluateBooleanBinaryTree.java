package leetCode.Trees.easy;

import leetCode.Trees.TreeNode;

public class EvaluateBooleanBinaryTree {

	 public boolean evaluateTree(TreeNode root) {
	       if(root.val==0) return false;
	       if(root.val==1) return true;
           if(root.val==2) return evaluateTree(root.left)||evaluateTree(root.right);
           else
        	  return evaluateTree(root.left)&&evaluateTree(root.right);
	    }

	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(2);
        root.left=new TreeNode(1);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(0);
        root.right.right=new TreeNode(1);
        
        System.out.println(new EvaluateBooleanBinaryTree().evaluateTree(root));
        
	}

}
