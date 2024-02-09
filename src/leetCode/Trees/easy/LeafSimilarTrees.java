package leetCode.Trees.easy;

import java.util.ArrayList;

import leetCode.Trees.TreeNode;

public class LeafSimilarTrees {
	
	ArrayList<Integer> ar1=new ArrayList<>();
	ArrayList<Integer> ar2=new ArrayList<>();
	
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {

		helper(root1,ar1);
		helper(root2,ar2);
		if(ar1.size()!=ar2.size()) return false;
		for(int i=0;i<ar1.size();i++){
			if(ar1.get(i)!=ar2.get(i)) return false;
		}
		return true;
	}

	public void helper(TreeNode root,ArrayList ar){
		if(root==null) return;

		if(root.left==null&&root.right==null){
			ar.add(root.val);
		}
		helper(root.left,ar);
		helper(root.right,ar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root1=new TreeNode(3);
		root1.left=new TreeNode(5);
		root1.right=new TreeNode(1);

		root1.left.left=new TreeNode(6);
		root1.left.right=new TreeNode(2);
		root1.left.right.left=new TreeNode(7);
		root1.left.right.right=new TreeNode(4);

		root1.right.left=new TreeNode(9);
		root1.right.right=new TreeNode(8);


		TreeNode root2=new TreeNode(3);
		root2.left=new TreeNode(5);
		root2.right=new TreeNode(1);

		root2.left.left=new TreeNode(6);
		root1.left.right=new TreeNode(7);

		root2.right.left=new TreeNode(4);
		root2.right.right=new TreeNode(2);
		root2.right.right.left=new TreeNode(9);
		root2.right.right.right=new TreeNode(8);


		System.out.println(new LeafSimilarTrees().leafSimilar(root1,root2));
	}

}
