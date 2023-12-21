package leetCode.Trees.easy;

import leetCode.Trees.TreeNode;

public class SearchInBST {
	
	 public TreeNode searchBST(TreeNode root, int val) {

	        if(root==null||root.val==val) return root;
	        if(root.val>val)
	        	return searchBST(root.left, val);
	       return searchBST(root.right, val);
	        
	 }
	 
	 public TreeNode searchBST1(TreeNode root, int val) {

	      while(root!=null) {
	    	  if(val<root.val) {
	    		  root=root.left;
	    	  }
	    	  else if(val>root.val){
	    		  root=root.right;
	    	  }
	    	  else {
	    		  return root;
	    	  }
	      }
	      return null;
	        
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(4);
		root.left=new TreeNode(2);
		root.right=new TreeNode(7);
		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(3);
		
		System.out.println(new SearchInBST().searchBST(root, 3));
		System.out.println(new SearchInBST().searchBST1(root, 3));

	}

}
