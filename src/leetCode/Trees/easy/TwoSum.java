package leetCode.Trees.easy;

import java.util.ArrayList;
import java.util.HashSet;

import leetCode.Trees.TreeNode;

public class TwoSum {

	ArrayList<Integer> al=new ArrayList<>();
	public boolean findTarget(TreeNode root, int k) {
		find(root);
		int left=0;
		int right=al.size()-1;
		while(left<right) {
			int sum=al.get(left)+al.get(right); 
			if(sum>k) {
				sum-=al.get(right);
				right--;
			}
			else
				if(sum<k) {
					sum-=al.get(left);
					left++;
				}
				else return true;
		}
		return false;

	}

	public void find(TreeNode root) {
		if(root==null) return ;
		find(root.left);
		al.add(root.val);
		find(root.right);
	}

	HashSet<Integer> hs=new HashSet<>();
	public boolean findTargetI(TreeNode root, int k) {
		if(root==null) return false;
		if(hs.contains(k-root.val)) return true;
		hs.add(root.val);
		if(findTargetI(root.left, k)) return true;
		return findTargetI(root.right, k);
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(3);
		root.right=new TreeNode(6);
		root.left.left=new TreeNode(2);
		root.left.right=new TreeNode(4);
		root.right.right=new TreeNode(7);

		System.out.println(new TwoSum().findTarget(root, 9));

		System.out.println(new TwoSum().findTargetI(root, 9));
	}

}
