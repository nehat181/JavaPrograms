package leetCode.Trees.easy;

import java.util.LinkedList;
import java.util.Queue;

import leetCode.Trees.TreeNode;

public class MinimumDepth {
	
	public int minDepth(TreeNode root) {
		 if(root==null) return 0;
	       int count=1;
	       Queue<TreeNode> q=new LinkedList<>();
	       q.add(root);
	       while(!q.isEmpty()){
	         int size=q.size();
	         for(int i=0;i<size;i++){
	           TreeNode ele=q.poll();
	            if(ele.left==null&&ele.right==null){
	             return count;     
	            }
	            if(ele.left!=null){
	             q.add(ele.left);
	            }
	            if(ele.right!=null){
	             q.add(ele.right);
	            }       
	    }
	    count++;
	}
	return count;
    }
	
	public int minDepth1(TreeNode root) {
		  if(root==null) return 0;
	        if(root.left==null&&root.right==null) return 1;
	        if(root.left==null||root.right==null)
	       return 1+Math.max(minDepth(root.left),minDepth(root.right));

	        return 1+Math.min(minDepth(root.left),minDepth(root.right));
   }

   public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);
	   
//		TreeNode root=new TreeNode(2);
//		root.right=new TreeNode(3);
//		root.right.right=new TreeNode(4);
//		root.right.right.right=new TreeNode(5);
//		root.right.right.right.right=new TreeNode(5);
		
		System.out.println(new MinimumDepth().minDepth(root));
	}
}
