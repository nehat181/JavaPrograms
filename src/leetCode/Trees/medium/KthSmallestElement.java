package leetCode.Trees.medium;

import java.util.ArrayList;

import leetCode.Trees.TreeNode;

public class KthSmallestElement {

	ArrayList<TreeNode> ar=new ArrayList<>();
	public int kthSmallestI(TreeNode root, int k) {
		if(root==null) return 0;
		traverse1(root);
		return ar.get(k-1).val;
	}

	public void traverse1(TreeNode root){
		if(root==null) return;
		traverse1(root.left);
		ar.add(root);
		traverse1(root.right);
	}

	int ans=0;
	int count=0;
	
	public int kthSmallest(TreeNode root, int k) {
		traverse(root,k);
        return ans;
	}

	public void traverse(TreeNode root,int k){
		if(root==null) return ;
		traverse(root.left,k);
		count++;
		if(count==k) { 
			ans=root.val;
			return;
		}
		traverse(root.right,k);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(1);
		root.right=new TreeNode(4);
		root.left.right=new TreeNode(2);

		System.out.println(new KthSmallestElement().kthSmallestI(root, 1));
		System.out.println(new KthSmallestElement().kthSmallest(root, 1));
	}

}
