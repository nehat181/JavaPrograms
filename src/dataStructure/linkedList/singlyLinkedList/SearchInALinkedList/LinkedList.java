package dataStructure.linkedList.singlyLinkedList.SearchInALinkedList;
public class LinkedList {
	Node head=null;

	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;	
		}
	}

	public void push(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
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
	
	public int searchPosition(int x) {
		int pos=1;
		Node temp=head;
		while(temp!=null) {
			if(temp.data==x) {
				return pos;
			}
			pos++;
			temp=temp.next;
		}
		return -1;
	}
	
	public int searchPositionRecursion(int x) {
		int pos=1;
		if(head.data==x) {
			return pos;
		}
		int val=recur(head.next,x,pos+1);
		
		
		return val;
	}
	
	public int recur(Node head,int x,int pos) {
		if(head==null) {
			System.out.println("Position not found");
			return -1;
		}
		
		if(head.data==x) {
			return pos;
		}
		return recur(head.next,x,pos+1);
	
	}
	
	public int searchPositionRecursion1(Node head,int x) {
		if(head==null) {
			return -1;
		}
		if(head.data==x) {
			return 1;
		}
		else {
		int val=searchPositionRecursion1(head.next,x);
		if(val==-1) {
			System.out.println("Element not found");
			return -1;
		}
		else {
			return val+1;
		}
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.push(10);
		list.push(30);
		list.push(11);
		list.push(21);
		list.push(14);

		list.display();
		// 14,21,11,30,10
	System.out.println("Element found at-->"+list.searchPosition(55));
		
	System.out.println("Element found at-->"+list.searchPositionRecursion(55));
		
	System.out.println("Element found at-->"+list.searchPositionRecursion1(list.head,10));
	}
}
