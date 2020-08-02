package dataStructure;

import java.util.ArrayList;
import java.util.List;

class Node{
	Node left;
	Node right;
	int key;
	
	public Node(int item) {
		key=item;
		left=null;
		right=null;
		
	}
	
	
	
}
public class BinaryTree {
	
	static Node root;
	
	BinaryTree(int key){
		
		root=new Node(key);
	}
	
	
	
	
	
	
	public BinaryTree() {
		// TODO Auto-generated constructor stub
	}






	/* Original 
	 *     1 
	 *   2   3 
	 * 4   5  6
	 * */

	/* left,root,right 
	 * 42513
	 * */

	void printInorder(Node node) {
		
		if(node==null) return;
		
		printInorder(node.left);
		
		System.out.println(node.key);
		printInorder(node.right); 
		
		
	}
	
	/*
		 * Root left right 12453
		 */
void printPreorder(Node node) {
		
		if(node==null) return;
		
		System.out.println(node.key);
		
		printPreorder(node.left);
		
		
		
		printPreorder(node.right);
		
		
	}

/*
 *  left right Root 45231
 */
void printPostorder(Node node) {

if(node==null) return;



printPostorder(node.left);


printPostorder(node.right);
System.out.println(node.key);

}
public List<List<Integer>> levelOrder(Node root) {
    List<List<Integer>> res = new ArrayList();
    order(root, res, 0);
    return res;
}

private void order(Node root, List<List<Integer>> res, int i) {
    if (root==null) return;
    if (i >= res.size()) {
        res.add(new ArrayList<Integer>());
    }
    res.get(i).add(root.key);
    order(root.left, res, i+1);
    order(root.right, res, i+1);
}


public List<List<Integer>> ZigZaglevelOrder(Node root) {
    List<List<Integer>> res = new ArrayList();
    ZigZagorder(root, res, 0);
    return res;
}

private void ZigZagorder(Node root, List<List<Integer>> res, int i) {
    if (root==null) return;
    if (i >= res.size()) {
        res.add(new ArrayList<Integer>());
    }
    
    
    res.get(i).add(root.key);
    order(root.left, res, i+1);
    order(root.right, res, i+1);
}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt=new BinaryTree();
		bt.root=new Node(1);
        bt.root.left = new Node(2); 
        bt.root.right = new Node(3); 
        bt.root.left.left = new Node(4); 
        bt.root.left.right = new Node(5);
        bt.root.right.right = new Node(6); 
        
        System.out.println(new BinaryTree().levelOrder(root));
//        
//        System.out.println("Pre");
//        new BinaryTree().printPreorder(root);
//        System.out.println("Post");
//        new BinaryTree().printPostorder(root);
//        
        

	}

}
