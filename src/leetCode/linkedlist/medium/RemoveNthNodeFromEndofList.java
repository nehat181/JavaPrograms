package leetCode.linkedlist.medium;

public class RemoveNthNodeFromEndofList {
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

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode fast=head;
		ListNode slow=head;
		ListNode prev=null;
		for(int i=0;i<n;i++){
			fast=fast.next;
		}
		if(fast==null) return head.next;

		while(fast!=null){
			fast=fast.next;
			prev=slow;
			slow=slow.next;
		}
		if(prev!=null)
			prev.next=slow.next;

		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveNthNodeFromEndofList li=new RemoveNthNodeFromEndofList();
			li.insert(1);
			li.insert(2);
     		li.insert(3);
			li.insert(4);
			li.insert(5);
			int node=2;

		//		li.display(li.head);

//		li.insert(1);
//		li.insert(2);
//		int node=2;
//		li.display(li.head);

		ListNode ans=li.removeNthFromEnd(li.head, node);
		li.display(ans);
	}

}
