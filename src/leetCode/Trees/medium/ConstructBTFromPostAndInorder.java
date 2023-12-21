package leetCode.Trees.medium;

import leetCode.Trees.TreeNode;

public class ConstructBTFromPostAndInorder {
	int r=0;
	 public TreeNode buildTree(int[] inorder, int[] postorder) {
		  r=postorder.length-1;
		 TreeNode root=helper(inorder, postorder, 0, r);
		 return root;
	 }
	 
	 public TreeNode helper(int[] inorder, int[] postorder,int start,int end) {
		 if(start>end) return null;
		 TreeNode root=new TreeNode(postorder[r]);
		 r--;
		 int index=0;
		  for(int i=start;i<=end;i++) {
			  if(root.val==inorder[i])
				  index=i;
		  }
		  
		  root.right=helper(inorder, postorder, index+1, end);
		  root.left=helper(inorder, postorder, start, index-1);
		  return root;		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inorder= {9,3,15,20,7};
		int[] postorder= {9,15,7,20,3};
		System.out.println(new ConstructBTFromPostAndInorder().buildTree(inorder,postorder));
	}

}
