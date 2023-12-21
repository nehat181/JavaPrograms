package leetCode.Trees.medium;

import leetCode.Trees.TreeNode;

public class ConstructBTfromPreAndInorder {
	
	int r=0;
	public TreeNode buildTree(int[] preorder, int[] inorder) {
	       TreeNode ans= helper(preorder,inorder,0,inorder.length-1);
	       return ans;
	       
	    }
	
	public TreeNode helper(int[] preorder,int[] inorder, int start,int end) {
		if(start>end) return null;
		TreeNode root=new TreeNode(preorder[r]);
		r++;
		int index = 0;
		for(int i=start;i<=end;i++) {
			if(root.val==inorder[i])
				index=i;
		}
		root.left=helper(preorder, inorder, start, index-1);
		root.right=helper(preorder, inorder, index+1, end);
		return root;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] preorder= {3,9,20,15,7};
		int[] inorder= {9,3,15,20,7};
		System.out.println(new ConstructBTfromPreAndInorder().buildTree(preorder,inorder));
		
	}

}
