package leetCode.linkedlist.easy;

public class Palindrome {
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

	public boolean checkPalindrome() {
		ListNode slow=head;
		ListNode fast=head;
		ListNode nextNode=null;
		while(fast!=null&&fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		ListNode prev=null;
		while(slow!=null) {
			nextNode=slow.next;
			slow.next=prev;
			prev=slow;
			slow=nextNode;
		}
		while(prev!=null) {
			if(prev.val!=head.val) {
				return false;
			}
			prev=prev.next;
			head=head.next;
		}
		return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome li=new Palindrome();
		li.insert(1);
		li.insert(2);
		li.insert(3);
		li.insert(2);
		li.insert(1);
		li.display(li.head);

		System.out.println(li.checkPalindrome());
	}

}
