package dataStructure;

import dataStructure.SinglyLinkedList.Node;

public class ReorderLinkedList {
	
	
 static ListNode head=null;
 ListNode tail=null;
	
 class	ListNode{
	 ListNode next;
	 int data;
	 
	public ListNode(int data) {
		this.data=data;
		this.next=null;
		
	}
	 
	 
 }
 
 public void insert(int data) {
	 ListNode newNode=new ListNode(data);
	
	 if(head==null) {
		 head=newNode;
		 tail=newNode;
	 }
	 else {
		 tail.next=newNode;
		 tail=newNode;
	 }
 }
	
	 
	 public void reorderList(ListNode head) {
		
		 if(head==null||head.next==null) return;
		 
		 ListNode slow=head;
		 ListNode fast=head;
		 ListNode prev=head;
		 while(fast!=null&&fast.next!=null) {
			 prev=slow;
			 slow=slow.next;
			 fast=fast.next.next;
			 
		 }
		 prev.next=null;
		 ListNode l1=head;
		 ListNode l2=reverse(slow);
		merge(l1,l2);
	 }
	 
	 public  ListNode reverse(ListNode l2) {
		 if(l2==null) return null;
		 ListNode prev=null;
		 ListNode curr=l2;
		 ListNode next=l2.next;
		 while(curr!=null) {
			 next=curr.next;
			 curr.next=prev;
			 prev=curr;
			 curr=next;
		 }
		 return prev;
		 }
	 public void merge(ListNode l1,ListNode l2) {
		
		 while(l2!=null) {
			 
			 ListNode next=l1.next;
			 l1.next=l2;
			 l1=l2;
			 l2=next;
		 }
		 
	 }
	 
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReorderLinkedList obj=new ReorderLinkedList();
		  obj.insert(1); 
		  obj.insert(2);
		  obj.insert(3);
		  obj.insert(4);
		  obj.insert(5);
		  obj.reorderList(head);
		 

	}

}
