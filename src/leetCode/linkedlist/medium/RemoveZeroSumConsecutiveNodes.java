package leetCode.linkedlist.medium;

import java.util.HashMap;

public class RemoveZeroSumConsecutiveNodes {

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
	public ListNode removeZeroSumSublists(ListNode head) {
		HashMap<Integer,ListNode> hm=new HashMap<>();
		int sum=0;
		ListNode dummy=new ListNode(0,head);
		ListNode prev=dummy;
		while(prev!=null) {
			sum+=prev.val;
			if(hm.containsKey(sum)) {
				ListNode del=hm.get(sum).next;
				int key=sum+del.val;
				while(del!=prev) {
					hm.remove(key);
					del=del.next;
					key+=del.val;
				}
				hm.get(sum).next=prev.next;
			}
			else {
				hm.put(sum, prev);
			}
			prev=prev.next;
			
		}
		
			return dummy.next;
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	RemoveZeroSumConsecutiveNodes li=new RemoveZeroSumConsecutiveNodes();
	li.insert(1);
	li.insert(2);
	li.insert(3);
	li.insert(-1);
	li.insert(-2);
	li.display(li.head);
	ListNode ans=li.removeZeroSumSublists(li.head);
	li.removeZeroSumSublists(ans);
	System.out.println();
	li.display(ans);
}

}
