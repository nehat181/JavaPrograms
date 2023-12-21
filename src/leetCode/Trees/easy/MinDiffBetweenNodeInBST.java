package leetCode.Trees.easy;

import leetCode.Trees.TreeNode;

public class MinDiffBetweenNodeInBST {
	int min=Integer.MAX_VALUE;
    TreeNode prev=null;
    public int minDiffInBST(TreeNode root) {
        helper(root);
        return min;
    }

    public void helper(TreeNode root){
       if(root==null) return ;
       helper(root.left);
       if(prev!=null)
       min=Math.min(root.val-prev.val,min);
       prev=root;
       helper(root.right);

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(6);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        System.out.println(new MinDiffBetweenNodeInBST().minDiffInBST(root));
       
	}

}
