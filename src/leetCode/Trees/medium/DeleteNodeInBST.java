package leetCode.Trees.medium;

import leetCode.Trees.TreeNode;

public class DeleteNodeInBST {

	public TreeNode deleteNode(TreeNode root, int key) {
		  if(root==null) return null;
	 		
			if(key>root.val) {
				root.right=deleteNode(root.right, key);
			}
			else if(key<root.val) {
				root.left=deleteNode(root.left, key);
			}
			else
			if(root.left==null) {
				TreeNode temp=root.right;
				root=null;
				return temp;
			}
			else
			if(root.right==null) {
				TreeNode temp=root.left;
				root=null;
				return temp;
			}
			else {
			TreeNode succ=getSucessor(root);
			root.val=succ.val;
			root.right=deleteNode(root.right, succ.val);
			}
			
			return root;
	}

	public TreeNode getSucessor(TreeNode node) {
		node=node.right;
		while(node!=null&&node.left!=null)
			node=node.left;
		return node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(3);
		root.right=new TreeNode(6);

		root.left.left=new TreeNode(2);
		root.left.right=new TreeNode(4);

		root.right.right=new TreeNode(7);
		
		System.out.println(new DeleteNodeInBST().deleteNode(root, 4));

	}

}
