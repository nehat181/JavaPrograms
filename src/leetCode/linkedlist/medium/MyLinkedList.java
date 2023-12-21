package leetCode.linkedlist.medium;

/*Design Linked List*/
public class MyLinkedList {

	Node head=null;
	int size=0;

	class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			next=null;
		}
	}
	public MyLinkedList() {

	}

	public int get(int index) {
		if(index>=size) return -1;
		Node temp=head;
		for(int i=0;i<index;i++){
			temp=temp.next;
		}
		return temp.data;
	}

	public void addAtHead(int val) {
		Node newNode=new Node(val);
		size++;
		if(head==null){
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;

	}

	public void addAtTail(int val) {
		Node newNode=new Node(val);
		Node temp=head;
		size++;
		if(head==null){
			head=newNode;
			return;
		}  
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newNode;   
	}

	public void addAtIndex(int index, int val) {
		if(index>size) return;
		Node newNode=new Node(val);
		Node temp=head;
		if(index==0) {
			addAtHead(val);
		}
		else{
			size++;
			for(int i=0;i<index-1;i++){
				temp=temp.next;
			}
			newNode.next=temp.next;
			temp.next=newNode;
		}
	}

	public void deleteAtIndex(int index) {
		if(index>=size) return;
		size--;
		if(index==0) {
			head=head.next;

		}
		else
		{
			Node curr=head;
			Node temp=null;
			for(int i=0;i<index-1;i++){
				curr=curr.next;
			} 
			temp=curr.next;
			curr.next=temp.next;        
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedList obj = new MyLinkedList();

		obj.addAtHead(1);
		obj.addAtTail(3);
		obj.addAtIndex(1,2);
		int param_1 = obj.get(1);
		obj.deleteAtIndex(1);
		int param_2 = obj.get(0);

	}

}
