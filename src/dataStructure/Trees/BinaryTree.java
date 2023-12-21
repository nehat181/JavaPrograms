package dataStructure.Trees;

import java.util.Queue;

public class BinaryTree {

	Node root=null;
	public static class Node{
		int key;
		Node left;
		Node right;
		Node(int k){
			key=k;
			left=right=null;
		}
	}

	/* Left-Root-Right */

	public void inOrderTraversal(Node root) {

		if(root==null) return;

		inOrderTraversal(root.left);
		System.out.println(root.key);
		inOrderTraversal(root.right);

	}

	/*Root-Left-Right */

	public void PreOrderTraversal(Node root) {

		if(root==null) return;

		System.out.println(root.key);
		PreOrderTraversal(root.left);
		PreOrderTraversal(root.right);	
	}

	/*Left-Right-Root */

	public void PostOrderTraversal(Node root) {

		if(root==null) return;

		PostOrderTraversal(root.left);
		PostOrderTraversal(root.right);
		System.out.println(root.key);

	}

	/*Find height of the binary tree */

	public int findHeight(Node root) {

		if(root==null) return 0;
		return Math.max(findHeight(root.left), findHeight(root.right))+1;

	}

	/* using height */
	public void leftOrderTraversalNaive(Node root) {

		if(root==null) return ;
		int height=findHeight(root);
		for(int i=1;i<=height;i++) {
			printCurrentLevelNodes(root, i);
		}

	}

	public void printCurrentLevelNodes(Node root,int level) {

		if(root==null) return ;
		if(level==1)
			System.out.print(root.key+" ");
		else if(level>1) {
			printCurrentLevelNodes(root.left, level-1);
			printCurrentLevelNodes(root.right, level-1);
		}

	}

	public void leftOrderTraversal(Node root) {

		if(root==null) return;

		Queue<Node> q=new java.util.LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node current=q.poll();
			System.out.print(current.key+" ");
			if(current.left!=null) {
				q.add(current.left);
			}
			if(current.right!=null) {
				q.add(current.right);
			}
		}
	}

	public void leftOrderTraversalI(Node root) {

		if(root==null) return;

		Queue<Node> q=new java.util.LinkedList<>();
		q.add(root);
		q.add(null);
		while(q.size()>1) {
			Node current=q.poll();
			if(current==null) {
				System.out.println();
				q.add(null);
			}
			else {
				System.out.print(current.key+" ");
				if(current.left!=null) {
					q.add(current.left);
				}
				if(current.right!=null) {
					q.add(current.right);
				}
			}
		}
	}

	public void leftOrderTraversalII(Node root) {

		if(root==null) return;

		Queue<Node> q=new java.util.LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int count=q.size();
			for(int i=0;i<count;i++) {
				Node current=q.poll();
				System.out.print(current.key+" ");
				if(current.left!=null) {
					q.add(current.left);
				}
				if(current.right!=null) {
					q.add(current.right);
				}
			}
			System.out.println();
		}
	}

	public void leftView(Node root) {

		if(root==null) return;

		Queue<Node> q=new java.util.LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int count=q.size();
			for(int i=0;i<count;i++) {
				Node current=q.poll();
				if(i==0) {
					System.out.print(current.key+" ");
				}
				if(current.left!=null) {
					q.add(current.left);
				}
				if(current.right!=null) {
					q.add(current.right);
				}
			}
		}
	}
	
	public void rightView(Node root) {

		if(root==null) return;

		Queue<Node> q=new java.util.LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int count=q.size();
			for(int i=0;i<count;i++) {
				Node current=q.poll();
				if(i==count-1) {
					System.out.print(current.key+" ");
				}
				if(current.left!=null) {
					q.add(current.left);
				}
				if(current.right!=null) {
					q.add(current.right);
				}
			}
		}
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
		root.right.left=new Node(60);


		BinaryTree tree=new BinaryTree();
		//tree.inOrderTraversal(root);
		//tree.PreOrderTraversal(root);
		tree.PostOrderTraversal(root);

		System.out.println("Height is "+tree.findHeight(root));

		//tree.leftOrderTraversalNaive(root);
		tree.leftOrderTraversal(root);

		tree.leftOrderTraversalI(root);
		//tree.leftOrderTraversalII(root);
		System.out.println("Left View");
		tree.leftView(root);
		
		System.out.println("right View");
		tree.rightView(root);
	}

}
