package leetCode.Trees.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import leetCode.Trees.TreeNode;

public class BinaryTreeLevelOrderTraversalII {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> ans=new ArrayList<List<Integer>>();
		Queue<TreeNode> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			ArrayList<Integer> lvl=new ArrayList<>();
			int count=q.size();
			for(int i=0;i<count;i++) {
				TreeNode current=q.poll();
				if(current!=null) {
					lvl.add(current.val);
					if(current.left!=null) {
						q.add(current.left);
					}
					if(current.right!=null) {
						q.add(current.right);
					}
				}
			}

			if(lvl.size()>0) {
				ans.add(0, lvl);
			}
		}

		return ans;      
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeNode root=null;
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);

		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);

		System.out.println(new BinaryTreeLevelOrderTraversalII().levelOrderBottom(root));
	}

}
