package leetCode.linkedlist.medium;

public class ReverseLinkedListII {
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

	public ListNode reverseBetween(ListNode head, int left, int right) {
		
		if(head==null||head.next==null||left==right) return head;
		
		ListNode dummy=new ListNode(0,head);
		ListNode prev=dummy;
		ListNode curr=head;
		int count=1;
		
		while(count<left) {
			prev=curr;
			curr=curr.next;
			count++;
		}
		ListNode leftNode=curr;
		
		while(count<right) {
			curr=curr.next;
			count++;
		}
		ListNode afterRight=curr.next;
		curr.next=null;
		
		ListNode rev=reverse(leftNode);
		prev.next=rev;
		while(rev.next!=null)
		{
			rev=rev.next;
		}
		rev.next=afterRight;
		
		return dummy.next;
	}

	public ListNode reverse(ListNode node){
		ListNode curr=node;
		ListNode prev=null;
		while(curr!=null){
			ListNode next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedListII  li=new ReverseLinkedListII();
//		li.insert(1);
//		li.insert(2);
		li.insert(3);
		li.insert(4);
		//li.insert(5);
		li.display(li.head);

		ListNode ans=li.reverseBetween(li.head, 1,2);
		System.out.println();
		li.display(ans);


	}

}
