package leetCode.Trees.easy;

import leetCode.Trees.TreeNode;

public class BinaryTreeTilt {
	
	int sum=0;
    public int findTilt(TreeNode root) {
        helper(root);
        return sum;
        
    }

     public int helper(TreeNode root) {
       if(root==null) return 0;
       
       int left=helper(root.left);
       int right=helper(root.right);
       sum+=Math.abs(left-right);
       return root.val+left+right;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(9);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(5);

        root.right.right=new TreeNode(7);
        
        System.out.println(new BinaryTreeTilt().findTilt(root));
	}

}
