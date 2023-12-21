package leetCode.Trees.easy;

import leetCode.Trees.TreeNode;

public class SameTree {

	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        if(p==null||q==null||p.val!=q.val) return false;
       
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
	boolean flag=true;
	
	public boolean isSameTree1(TreeNode p, TreeNode q) {
		if(p==null&&q==null) return true;
        if(p==null||q==null||p.val!=q.val) {
            flag=false;
            return flag;
        }
        isSameTree(p.left,q.left);
        isSameTree(p.right,q.right);
        return flag;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root1=new TreeNode(1);
		root1.left=new TreeNode(2);
		root1.right=new TreeNode(3);
		
		TreeNode root2=new TreeNode(1);
		root2.left=new TreeNode(2);
		root2.right=new TreeNode(3);
		
		System.out.println(new SameTree().isSameTree1(root1, root2));
	}

}
