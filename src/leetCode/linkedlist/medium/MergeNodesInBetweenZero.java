package leetCode.linkedlist.medium;

public class MergeNodesInBetweenZero {
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

	public ListNode mergeNodes(ListNode head) {
		 ListNode index=head;
	        ListNode curr=head.next;
	        int sum=0;
	        while(curr!=null){
	            if(curr.val==0){
	                index.next=new ListNode(sum);
	                index=index.next;
	                sum=0;
	            }
	            sum+=curr.val;
	            curr=curr.next;
	        }
	        return head.next; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeNodesInBetweenZero li=new MergeNodesInBetweenZero();
		li.insert(0);
		li.insert(3);
		li.insert(1);
		li.insert(0);
		li.insert(4);
		li.insert(5);
		li.insert(2);
		li.insert(0);
		li.display(li.head);
		System.out.println();
		
		ListNode ans=li.mergeNodes(li.head);
		li.display(ans);


	}
}
