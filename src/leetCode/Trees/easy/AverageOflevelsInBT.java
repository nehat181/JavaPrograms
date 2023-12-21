package leetCode.Trees.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetCode.Trees.TreeNode;

public class AverageOflevelsInBT {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> li=new ArrayList<>();
		if(root==null) return li;
		Queue<TreeNode> q=new LinkedList<>();
		int count=0;
		double sum=0;
		q.add(root);
		q.add(null);
		while(q.size()>=1){
			TreeNode curr=q.poll();
			if(curr==null){
				q.add(null);
				li.add(sum/count);
				if(q.size()==1) break;
				count=0;
				sum=0;

			}
			else {
				sum+=curr.val;
				count++;

				if(curr.left!=null){
					q.add(curr.left);
				}
				if(curr.right!=null){
					q.add(curr.right);
				}
			}
		}
		return li;
	}

	public List<Double> averageOfLevels1(TreeNode root) {
		List<Double> li=new ArrayList<>();
		if(root==null) return li;
		Queue<TreeNode> q=new LinkedList<>();
		int count=0;
		double sum=0;
		q.add(root);
		while(!q.isEmpty()){
			int size=q.size();
			count=size;
			for(int i=0;i<size;i++){
				TreeNode curr=q.poll();
				sum+=curr.val;
				if(curr.left!=null){
					q.add(curr.left);
				}
				if(curr.right!=null){
					q.add(curr.right);
				}  
			}
			li.add(sum/count);   
			sum=0;
		}
		return li;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);

		System.out.println(new AverageOflevelsInBT().averageOfLevels(root));
		System.out.println(new AverageOflevelsInBT().averageOfLevels1(root));
	}

}
