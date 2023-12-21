package leetCode.Trees.medium;

import leetCode.Trees.TreeNode;

public class InsertBST {
	
	public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) {
            TreeNode newNode=new TreeNode(val);
            return newNode;
        }
        if(val>root.val){
            root.right=insertIntoBST(root.right,val);
        }
        else 
        if(val<root.val){
           root.left= insertIntoBST(root.left,val);
        }
      return root;  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(4);
		root.left=new TreeNode(2);
		root.right=new TreeNode(7);
		
		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(3);
		
		System.out.println(new InsertBST().insertIntoBST(root, 5));
		
		
	}

}
