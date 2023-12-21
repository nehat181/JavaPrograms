package leetCode.Trees.medium;

import leetCode.Trees.TreeNode;

public class KthLargestElement {
	int ans=0;
	int count=0;

	public int kthLargest(TreeNode root, int k) {
		traverse(root,k);
		return ans;
	}

	public void traverse(TreeNode root,int k){
		if(root==null) return ;
		traverse(root.right,k);
		count++;
		if(count==k) { 
			ans=root.val;
			return;
		}
		traverse(root.left,k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(1);
		root.right=new TreeNode(4);
		root.left.right=new TreeNode(2);
		System.out.println(new KthLargestElement().kthLargest(root, 1));

	}
}
