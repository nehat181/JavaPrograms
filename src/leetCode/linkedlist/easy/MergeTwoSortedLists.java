package leetCode.linkedlist.easy;

public class MergeTwoSortedLists {
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

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode newList=new ListNode();
		ListNode l1=list1;
		ListNode l2=list2;
		ListNode newNode=newList;
		while(l1!=null&&l2!=null){
			if(l1.val<l2.val) {
				newNode.next=l1;
				l1=l1.next;
			}
			else {
				newNode.next=l2;
				l2=l2.next;
			}
			newNode=newNode.next;	
		}
		if(l1!=null) {
			newNode.next=l1;
		}
		else {
			newNode.next=l2;
		}
		return newList.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeTwoSortedLists li1=new MergeTwoSortedLists();
		li1.insert(1);
		li1.insert(2);
		li1.insert(4);

		li1.display(li1.head);

		MergeTwoSortedLists li2=new MergeTwoSortedLists();
		li2.insert(1);
		li2.insert(3);
		li2.insert(4);
		li2.display(li2.head);

		ListNode new1=li2.mergeTwoLists(li1.head, li2.head);
		li2.display(new1);

	}

}
