package leetCode.linkedlist.easy;

public class ReverseLinkedList {
	/*
	 * Given the head of a singly linked list, reverse the list, and return the
	 * reversed list.
	 */
	ListNode head=null;
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { 
			this.val = val;
		}
		ListNode(int val, ListNode next) { 
			this.val = val; this.next = next;
		}
	}
	public void insert(int data) {
		ListNode newNode=new ListNode(data);
		if(head==null) {
			head=newNode;
			return;
		}
		ListNode temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	public void display(ListNode head) {
		ListNode temp=head;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		while(temp!=null) {
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
	}	
	public ListNode reverseList(ListNode head) {

		ListNode curr=head;
		ListNode prev=null;
		ListNode temp=null;
		while(curr!=null){
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseLinkedList li=new ReverseLinkedList();
		li.insert(1);
		li.insert(2);
		li.insert(3);
		li.insert(4);
		li.insert(5);
		li.display(li.head);
		
		ListNode out=li.reverseList(li.head);
		System.out.println();
		li.display(out);
	}

}
