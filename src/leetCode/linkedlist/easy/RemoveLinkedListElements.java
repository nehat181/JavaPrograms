package leetCode.linkedlist.easy;

public class RemoveLinkedListElements {

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
	public ListNode removeElements(ListNode head, int val) {

		while(head!=null&&head.val==val) {
			head=head.next;
		}
		ListNode temp=head;
		ListNode prev=null;

		while(temp!=null){
			if(temp.val==val){
				prev.next=temp.next;
				temp=temp.next;
			}
			else{
				prev=temp;
				temp=temp.next;
			}

		}
		return head; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveLinkedListElements li=new RemoveLinkedListElements();
		li.insert(1);
		li.insert(2);
		li.insert(6);
		li.insert(3);
		li.insert(4);
		li.insert(5);
		li.insert(6);
		int val=6;

		//li.insert(7);
		//li.insert(7);
		//li.insert(7);
		//li.insert(7);
		//int val=7;
		li.display(li.head);

		ListNode ans=li.removeElements(li.head, val);

		li.display(ans);


	}

}
