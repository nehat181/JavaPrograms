package leetCode.linkedlist.medium;

import leetCode.linkedlist.easy.Palindrome.ListNode;

public class RotateLinkedList {
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
		System.out.println();
	}

	public ListNode rotateRight(ListNode head, int k) {
		ListNode curr=head;
		int size=1;
		if(head==null||head.next==null||k==0) return head;
		while(curr.next!=null){
			curr=curr.next;
			size++;
		}
		curr.next=head;
		k=k%size;
		k=size-k;
		while(k!=0){
			curr=curr.next;
			k--;
		}
		head=curr.next;
		curr.next=null;
		return head;


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateLinkedList li=new RotateLinkedList();
		li.insert(1);
		li.insert(2);
		//	li.insert(3);
		//	li.insert(4);
		//	li.insert(5);
		li.display(li.head);

		ListNode ans=li.rotateRight(li.head, 1);
		li.display(ans);

	}

}
