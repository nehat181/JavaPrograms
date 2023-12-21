package leetCode.Trees.medium;

import leetCode.Trees.TreeNode;

public class AverageOfSubTree {

	int count=0;
	int sum=0;
	int nodes=0;
	public int averageOfSubtree(TreeNode root) {

		if(root==null) return 0;
		helper(root);
		if(root.val==sum/nodes){
			count++;
		}
		sum=0;
		nodes=0;
		averageOfSubtree(root.left);
		averageOfSubtree(root.right);
		return count;
	}

	public void helper(TreeNode root){
		if(root==null) return;
		sum+=root.val;
		nodes++;
		helper(root.left);
		helper(root.right);
	}
	
	 public int averageOfSubtree1(TreeNode root) {
	        helper1(root);
	        return count;
	        
	    }

	    public int[] helper1(TreeNode root){
	        if(root==null) return new int[]{0,0};
	       int [] left= helper1(root.left);
	        int [] right=helper1(root.right);
	        int sum=left[0]+right[0]+root.val;
	        int nodes=left[1]+right[1]+1;
	        if(sum/nodes==root.val)
	        count++;
	        return new int[]{sum,nodes};
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(4);
		root.left=new TreeNode(8);
		root.left.left=new TreeNode(0);
		root.left.right=new TreeNode(1);
		root.right=new TreeNode(5);
		root.right.right=new TreeNode(6);
		
		System.out.println(new AverageOfSubTree().averageOfSubtree1(root));
	}

}
