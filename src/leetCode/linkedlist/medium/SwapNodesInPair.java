	package leetCode.linkedlist.medium;

public class SwapNodesInPair {
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
	  public ListNode swapPairs(ListNode head) {
		  if(head==null||head.next==null) return head;
	        ListNode dummy=new ListNode(0,head);
	        ListNode prev=dummy;
	        ListNode curr=head;
	        while(curr!=null&&curr.next!=null){
	           prev.next=curr.next;
	           curr.next=prev.next.next;
	           prev.next.next=curr;
	           
	           prev=curr;
	           curr=prev.next;
	           
	        }
	        return dummy.next;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNodesInPair li=new SwapNodesInPair();
		li.insert(1);
		li.insert(2);
		li.insert(3);
		li.insert(4);
		li.display(li.head);
		
		ListNode ans=li.swapPairs(li.head);
		li.display(ans);
	}

}
