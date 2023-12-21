package leetCode.Trees.medium;

import java.util.LinkedList;
import java.util.Queue;

import leetCode.Trees.TreeNode;

public class DeepestLeavesSum {
	
	public int deepestLeavesSum1(TreeNode root) {

        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int sum=0;
        int count=1;
        int maxHeight=hieght(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode ele=q.poll();
                if(ele.left==null&&ele.right==null&&count==maxHeight){
                    sum+=ele.val;
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
        return sum;
    }
	
	public int hieght(TreeNode root) {
		if(root==null) return 0;
		int l=hieght(root.left);
		int r=hieght(root.right);
		return 1+Math.max(l,r);
	}
	
	int sum=0;
    int h=0;
    public int deepestLeavesSum(TreeNode root) {
         h=hieght(root);
         return traverse(root,1);

    }
     public int traverse(TreeNode root,int curr) {
        if(root==null) return 0;
        traverse(root.left,curr+1);
        traverse(root.right,curr+1);
        if(root.left==null&&root.right==null&&curr==h){
            sum+=root.val;
        }
        return sum;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		
		root.right.right=new TreeNode(6);
		
		root.left.left.left=new TreeNode(7);
		root.right.right.right=new TreeNode(8);
		
		System.out.println(new DeepestLeavesSum().deepestLeavesSum(root));
	}

}
