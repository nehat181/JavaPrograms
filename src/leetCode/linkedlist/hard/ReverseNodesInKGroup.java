package leetCode.linkedlist.hard;

public class ReverseNodesInKGroup {

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

	public ListNode reverseKGroup(ListNode head, int k) {
		if(head==null&head.next==null) return head;
		ListNode temp=head;
		ListNode end=head;
		ListNode rev=null;
		ListNode next=null;
		int count=1;
		ListNode dummy=new ListNode(-1,head);
		ListNode prev=dummy;
		while(end!=null&&end.next!=null&&count<=k){
			end=end.next;
			count++;
			if(count==k){
				next=end.next;
				end.next=null;
				rev=reverse(temp);
				prev.next=rev;
				while(rev.next!=null){
					rev=rev.next;
				}
				rev.next=next; 
			
			prev=rev;
			temp=next;
			end=next;
			count=1;
			}
		}
		return dummy.next;
	}

	public ListNode reverse(ListNode head){
		ListNode temp=head;
		ListNode prev=null;
		ListNode n=null;
		while(temp!=null){
			n=temp.next;
			temp.next=prev;
			prev=temp;
			temp=n;
		}
		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNodesInKGroup  li=new ReverseNodesInKGroup();
		li.insert(1);
	    li.insert(2);
		li.insert(3);
		li.insert(4);
		li.insert(5);
		li.display(li.head);

		ListNode ans=li.reverseKGroup(li.head,2);
		System.out.println();
		li.display(ans);


	}



}
