package leetCode.Trees.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import leetCode.Trees.TreeNode;

   public class FindBottomLeftTreeValue {
	int height;
	int val;
	public int findBottomLeftValue(TreeNode root) {
		height=-1;
		val=0;
		dfs(root,0);
		return val;        
	}

	public void dfs(TreeNode root,int h){
		if(root==null) return ;
		if(h>height){
			height=h;
			val=root.val;
		}
		dfs(root.left,h+1);
		dfs(root.right,h+1);
	}
	
	
	public int bfs(TreeNode root) {
		Queue<TreeNode> q=new LinkedList<>();
		q.add(root);
		int ans=0;
		while(!q.isEmpty()) {
			
			TreeNode curr=q.poll();
			if(curr.right!=null) {
				q.add(curr.right);
			}
			
			if(curr.left!=null) {
				q.add(curr.left);
			}
			ans=curr.val;
		}

		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);

		root.left.left=new TreeNode(4);

		root.right.left=new TreeNode(5);
		root.right.right=new TreeNode(6);

		root.right.left.left=new TreeNode(7);
		System.out.println(new FindBottomLeftTreeValue().findBottomLeftValue(root));

	}

}
