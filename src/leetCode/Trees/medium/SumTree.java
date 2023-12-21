package leetCode.Trees.medium;

import leetCode.Trees.TreeNode;

public class SumTree {
	
	boolean flag=true;
	boolean isSumTree(TreeNode root)
	{
           helper(root);
           return flag;
	}
	public 
	
		int helper(TreeNode root)
	{
            if(root==null) return 0;
            
            int leftSum=helper(root.left);
            int rightSum=helper(root.right);
           
           if(root.left==null&&root.right==null) return root.val;
           if(root.val!=(leftSum+rightSum)){
               flag=false;
           }
           
            return root.val+leftSum+rightSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeNode root=new TreeNode(3);
         root.left=new TreeNode(1);
         root.right=new TreeNode(2);
         System.out.println(new SumTree().isSumTree(root));
      
	}

}
