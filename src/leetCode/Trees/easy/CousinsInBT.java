package leetCode.Trees.easy;

import leetCode.Trees.TreeNode;

public class CousinsInBT {

	int x1=0;
	int y1=0;
	TreeNode pX=null;
	TreeNode pY=null;
	public boolean isCousins(TreeNode root, int x, int y) {
		depth(root,x,y,0,null);
		if(x1==y1&&pX!=pY) return true;
		return false;
	}

	public void depth(TreeNode root,int x,int y,int height,TreeNode parent){
		if(root==null) return;
		if(root.val==x){
			pX=parent;
			x1=height;
		}
		if(root.val==y){
			pY=parent;
			y1=height;
		}
		parent=root;
		depth(root.left,x,y,height+1,parent);
		depth(root.right,x,y,height+1,parent);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);

		System.out.println(new CousinsInBT().isCousins(root,4,3));

	}

}
