package leetCode.linkedlist.medium;

public class DeleteMiddleNode {

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
	
	public ListNode deleteMiddle(ListNode head) {
		if(head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;

        while(fast!=null&&fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        prev.next=slow.next;
        
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteMiddleNode li=new DeleteMiddleNode();
		li.insert(1);
		li.insert(2);
		li.insert(3);
		li.insert(4);
		
		li.display(li.head);
		
		ListNode ans=li.deleteMiddle(li.head);
		li.display(ans);
	}

}
