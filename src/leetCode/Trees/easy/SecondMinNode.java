package leetCode.Trees.easy;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import leetCode.Trees.TreeNode;

public class SecondMinNode {
	int min=Integer.MAX_VALUE;
	int sec_min=Integer.MAX_VALUE;
	
	public int findSecondMinimumValue(TreeNode root) {
		helper(root);
		return sec_min==Integer.MAX_VALUE?-1:sec_min;
	}
	public void helper(TreeNode root) {
		if(root==null) return;
			
		if(root.val<min) {
			min=root.val;
		}
		if(root.val>min&&root.val<sec_min) {
			sec_min=root.val;
		}
		helper(root.left);
		helper(root.right);
	}
	Set<Integer> hs=new TreeSet<Integer>();
	public int findSecondMinimumValueI(TreeNode root) {
		int ans=0;
		traverse(root);
		Iterator<Integer> ite=hs.iterator();
		if(hs.size()>=2){
			for(int i=0;i<2;i++){
				ans=ite.next();
			}
		}
		else 
			ans=-1;
		return ans;
	}

	public void traverse(TreeNode root){
		if(root==null) return;
		traverse(root.left);
		hs.add(root.val);
		traverse(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(2);
		root.left=new TreeNode(2);
		root.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);

		System.out.println(new SecondMinNode().findSecondMinimumValueI(root));
		System.out.println(new SecondMinNode().findSecondMinimumValue(root));
	}

}
