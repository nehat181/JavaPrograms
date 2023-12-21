package leetCode.linkedlist.medium;

public class MaximumTwinSumOfALinkedList {
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

	public int pairSum(ListNode head) {
		if(head.next.next==null) return head.val+head.next.val;
		ListNode curr=head;
		ListNode slow=head;
		ListNode fast=head;
		ListNode prev=null;
		while(fast!=null&&fast.next!=null) {
			prev=slow;
			slow=slow.next;
			fast=fast.next.next;
			
		}
	
		ListNode curr1=slow;
		prev.next=null;
		prev=null;
		while(curr1!=null){
			ListNode n1=curr1.next;
			curr1.next=prev;
			prev=curr1;
			curr1=n1;
		}
		curr=head;
		int max=Integer.MIN_VALUE;
		int sum=0;
		while(curr!=null) {
			sum=curr.val+prev.val;
			max=Integer.max(max, sum);
			curr=curr.next;
			prev=prev.next;
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumTwinSumOfALinkedList li=new MaximumTwinSumOfALinkedList();
		li.insert(5);
		li.insert(4);
		li.insert(2);
		li.insert(1);
		li.insert(8);
		li.insert(9);

		li.display(li.head);
		
		int ans=li.pairSum(li.head);
		System.out.println(ans);

	}

}
