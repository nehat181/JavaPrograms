package leetCode.Trees.easy;

import leetCode.Trees.TreeNode;

public class Mirror {

	
	 boolean flag=true;
	    boolean areMirror(TreeNode a, TreeNode b) {
	        // Your code here
	         helper(a,b);
	         return flag;
	    }
	    
	    public boolean helper(TreeNode a,TreeNode b){
	        if(a==null&&b==null) return true;
	        if(a==null||b==null||a.val!=b.val) {
	               flag=false;
	                return false;
	        }
	        boolean f1=helper(a.left,b.right);
	        boolean f2=helper(a.right,b.left);
	        return f1&&f2;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root1=new TreeNode(1);
		root1.left=new TreeNode(2);
		root1.right=new TreeNode(3);
		
		TreeNode root2=new TreeNode(1);
		root2.left=new TreeNode(3);
		root2.right=new TreeNode(2);
		
		System.out.println(new Mirror().areMirror(root1, root2));
		
	}

}
