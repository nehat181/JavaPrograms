package leetCode.linkedlist.medium;

public class OddEvenLinkedList {

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


	public ListNode oddEvenList(ListNode head) {
		if(head==null||head.next==null) return head;
		ListNode odd=head;
		ListNode even=head.next;
		ListNode evenNode=even;
		while(odd.next!=null&&evenNode.next!=null) {
			odd.next=evenNode.next;
			odd=odd.next;
			evenNode.next=odd.next;
			evenNode=evenNode.next;
		}
		odd.next=even;
		return head;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddEvenLinkedList li=new OddEvenLinkedList();
		li.insert(1);
		li.insert(2);
		li.insert(3);
		li.insert(4);
		li.insert(5);

		li.display(li.head);

		ListNode out=li.oddEvenList(li.head);
		li.display(out);

	}

}
