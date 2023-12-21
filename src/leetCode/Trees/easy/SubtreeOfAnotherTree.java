package leetCode.Trees.easy;

import leetCode.Trees.TreeNode;

public class SubtreeOfAnotherTree {
	
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
	      if(root==null&&subRoot==null) return true;
	      if(root==null||subRoot==null) return false;
			if(isSameTree(root,subRoot)) return true;
			else
				return isSubtree(root.left, subRoot)||isSubtree(root.right, subRoot);
	        
	    }

	    public boolean isSameTree(TreeNode node1,TreeNode subRoot1){
	     if(node1==null&&subRoot1==null) return true;
			if(node1==null||subRoot1==null||node1.val!=subRoot1.val) return false;

			return isSameTree(node1.left,subRoot1.left)&&isSameTree(node1.right,subRoot1.right);
	           
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(4);
		root.right=new TreeNode(5);

		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(2);
		root.left.right.left=new TreeNode(0);

		TreeNode subRoot=new TreeNode(4);
		subRoot.left=new TreeNode(1);
		subRoot.right=new TreeNode(5);

		System.out.print(new SubtreeOfAnotherTree().isSubtree(root, subRoot));

	}

}
