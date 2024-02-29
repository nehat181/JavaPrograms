package leetCode.Trees.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetCode.Trees.TreeNode;

public class EvenOddTree {


	public boolean isEvenOddTree(TreeNode root) {
		return dfs(root);
	}

	public boolean dfs(TreeNode root){
		int level=0;   	

		Queue<TreeNode> q=new LinkedList<>();
		q.add(root);        

		while(!q.isEmpty()){
			int count=q.size();
			int prev=-1;
			for(int i=0;i<count;i++){
				TreeNode curr=q.poll();
				if(level%2==0) {
					if(curr.val%2==0) return false;
					if(prev!=-1&&prev>=curr.val) return false;
				}
				else {
					if(curr.val%2!=0) return false;
					if(prev!=-1 &&prev<=curr.val) return false;
				}
				if(curr.left!=null){
					q.add(curr.left);
				}
				if(curr.right!=null){
					q.add(curr.right);
				}
				prev=curr.val;
			}
			level++;
		}
		return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(10);
		root.right=new TreeNode(4);

		root.left.left=new TreeNode(3);
		root.left.left.left=new TreeNode(12);
		root.left.left.right=new TreeNode(8);


		root.right.left=new TreeNode(7);
		root.right.right=new TreeNode(9);

		root.right.left.left=new TreeNode(6);
		root.right.right.right=new TreeNode(2);

		System.out.println(new EvenOddTree().isEvenOddTree(root));

	}

}
