package leetCode.Trees.easy;

import leetCode.Trees.TreeNode;

public class InvertBinaryTree {

	TreeNode swap=null;
    public TreeNode invertTree(TreeNode root) {
       invert(root);
       return root;
        
    }

    public void invert(TreeNode root) {
        if(root==null) return ;
        swap=root.right;
        root.right=root.left;
        root.left=swap;

        invert(root.left);
        invert(root.right);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(4);
		root.left=new TreeNode(2);
		root.right=new TreeNode(7);
		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(3);
		
		root.right.left=new TreeNode(6);
		root.right.left.right=new TreeNode(8);
		
		System.out.println(new InvertBinaryTree().invertTree(root));
	}

}
