package leetCode.Trees.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import leetCode.Trees.TreeNode;

public class FindMode {

	HashMap<Integer,Integer> hm=new HashMap<>();
	public int[] findMode(TreeNode root) {
		ArrayList<Integer> ans=new ArrayList<>();
		traverse(root);
		int max=Integer.MIN_VALUE;
		for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
			max=Math.max(max,entry.getValue());
		}

		for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
			if(entry.getValue()==max){
				ans.add(entry.getKey());
			}
		}
		int[] out=new int[ans.size()];
		for(int i=0;i<ans.size();i++){
			out[i]=ans.get(i);
		}
		return out;

	}

	public void traverse(TreeNode root){
		if(root==null) return ;
		traverse(root.left);
		hm.put(root.val,hm.getOrDefault(root.val,0)+1);
		traverse(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		root.right=new TreeNode(2);
		root.right.left=new TreeNode(2);
		int [] ans=new FindMode().findMode(root);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]+" ");
		}
	}

}
