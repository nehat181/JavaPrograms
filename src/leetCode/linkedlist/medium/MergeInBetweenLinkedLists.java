package leetCode.linkedlist.medium;

public class MergeInBetweenLinkedLists {
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
	
	 public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
		 ListNode slow=list1;
	        ListNode fast=list1;
	        ListNode curr1=list1;
	        ListNode curr2=list2;
	        for(int i=0;i<=b-a;i++){
	            fast=fast.next;
	        }
	        while(a>1){
	            slow=slow.next;
	            fast=fast.next;
	            a--;
	        }
	        slow.next=curr2;
	        while(curr2.next!=null){
	            curr2=curr2.next;
	        }
	        curr2.next=fast.next;
	        return list1;	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeInBetweenLinkedLists li=new MergeInBetweenLinkedLists();
		li.insert(0);
		li.insert(1);
		li.insert(2);
		li.insert(3);
		li.insert(4);
		li.insert(5);
		li.display(li.head);

		MergeInBetweenLinkedLists li2=new MergeInBetweenLinkedLists();
		li2.insert(1000000);
		li2.insert(1000001);
		li2.insert(1000002);
		li2.display(li2.head);
		int a=3;
		int b=4;
		
		ListNode ans=li.mergeInBetween(li.head, a,b, li2.head);
		li.display(ans);
		
		}

}
