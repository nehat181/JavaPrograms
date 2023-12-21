package dataStructure.linkedList.singlyLinkedList.InsertionAndDeletion;

public class LinkedList {

	Node head=null;
	Node tail=null;

	class Node{
		int data;
		Node next;

		Node(int d){
			data=d;
			next=null;
		}
	}

	public void insert(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}

	public void insertAtBeginning(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}

	public void insertAfter(int after,int data) {
		Node newNode=new Node(data);
		Node temp=head;
		while(temp.data!=after) {
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;

	}

	public void insertAtEnd(int data) {
		Node newNode=new Node(data);
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}

		temp.next=newNode;		
	}

	public void DeleteAtBeginning() {
		Node temp=head;
		head=temp.next;
		temp=null;

	}

	public void DeleteAfter(int x) {
		Node temp=head;
		while(temp.data!=x) {
			temp=temp.next;
		}
		Node toDelete=temp.next;
		temp.next=temp.next.next;
		toDelete=null;

	}

	public void DeleteLastNode() {
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;

	}

	public void DeleteAllNodes() {

		Node temp;
		while(head!=null) {
			temp=head;
			head=head.next;
			temp=null;
		}
	}
	
	public void DeleteAllNodesRecursion(Node head) {
        if(head==null) {
        	System.out.println("All nodes are deleted sucessfully");
        	return;
        }
		Node temp=head;
		head=head.next;
		temp=null;
		DeleteAllNodesRecursion(head);
	}

	public void display() {
		Node temp=head;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);

		list.display();

		list.insertAtBeginning(0);
		System.out.println("Post Insertion at the beginning");
		list.display();

		list.insertAfter(3, 9);
		System.out.println("Post Insertion after 3");
		list.display();

		list.insertAtEnd(6);
		System.out.println("Post Insertion at the end");
		list.display();

		list.DeleteAtBeginning();
		System.out.println("Delete at the beginning");
		list.display();

		list.DeleteAfter(3);
		System.out.println("Delete After 3");
		list.display();

		list.DeleteLastNode();
		System.out.println("Delete last node");
		list.display();

//		list.DeleteAllNodes();
//		System.out.println("After deleting all nodes");
//		list.display();
		
		list.DeleteAllNodesRecursion(list.head);
		System.out.println("After deleting all nodes through recursion");
		list.display();



	}

}
