package leetCode.Trees.easy;

import java.util.ArrayList;
import java.util.List;

import leetCode.Trees.TreeNode;

public class BinaryTreePaths {
	List<String> ans=new ArrayList<>();
    String val="";
    public List<String> binaryTreePaths(TreeNode root) {
        traverse(root,val);
        return ans;
    }

    public void traverse(TreeNode root,String val){
      if(root==null) return;
      if(root.left==null&&root.right==null)
       {
         val+=String.valueOf(root.val);
         ans.add(val);
       }
      else
      val+=root.val+"->";
      traverse(root.left,val);
      traverse(root.right,val);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.right=new TreeNode(5);
		
		System.out.println(new BinaryTreePaths().binaryTreePaths(root));
		System.out.println(9/4);
		
	}

}
