package dataStructure.linkedList.singlyLinkedList.MiddleOfLinkedList;

public class LinkedList {
	Node head=null;

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
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
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

	public int findMiddle(Node head) {
		int val=0;
		Node temp=head;
		while(temp!=null) {
			temp=temp.next;
			val++;
		}
		temp=head;
		for(int i=0;i<(val/2-1);i++) {
			temp=temp.next;
		}
		return temp.data;	
	}
	
	public int findMiddleFastAndSlowPointer(Node head) {
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
//		list.insert(6);
//		list.insert(7);
//		list.insert(8);
//		list.insert(9);
//		list.insert(10);

		list.display();

		System.out.println("The middle element is "+list.findMiddle(list.head));
		
		System.out.println("The middle element through slow and fast pointer "+list.findMiddle(list.head));
	}

}
