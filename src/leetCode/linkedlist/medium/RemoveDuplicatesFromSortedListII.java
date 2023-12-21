package leetCode.linkedlist.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import leetCode.linkedlist.medium.AddTwoNumbers.ListNode;

public class RemoveDuplicatesFromSortedListII {

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
	 public ListNode deleteDuplicates(ListNode head) {
	     ListNode dummy=new ListNode(-1);
	     dummy.next=head;
	     ListNode prev=dummy;
	     while(head!=null) {
	    	 if(head.next!=null&&head.val==head.next.val) {
	    		 while(head.val==head.next.val) {
	    			 head=head.next;
	    		 }
	    		 prev.next=head.next;
	    	}
	    	 else {
	    		 prev=prev.next; 
	    	 }
	    	 head=head.next;
	     }
		 
		 return dummy.next;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesFromSortedListII li=new RemoveDuplicatesFromSortedListII();
//		li.insert(1);
//		li.insert(2);
//		li.insert(3);
//		li.insert(3);
//		li.insert(4);
//		li.insert(4);
//		li.insert(5);
		
		li.insert(1);
		li.insert(1);
		li.insert(1);
		li.insert(2);
		li.insert(3);
		li.display(li.head);
		
		ListNode ans=li.deleteDuplicates(li.head);
		li.display(ans);
		
	}

}
