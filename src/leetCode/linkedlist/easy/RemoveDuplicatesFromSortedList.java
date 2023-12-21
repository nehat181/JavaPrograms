package leetCode.linkedlist.easy;

public class RemoveDuplicatesFromSortedList {
	
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

	 public ListNode deleteDuplicates(ListNode head) {
	      //  HashSet<Integer> hs=new HashSet<>();
	        ListNode temp=head;
	        ListNode prev=null;
	        while(temp!=null){
	            if(prev!=null&&prev.val==temp.val){
	            prev.next=temp.next;
	            temp=temp.next;
	            }
	            else{
	           // hs.add(temp.val);
	            prev=temp;
	            temp=temp.next;
	        }
	        }
	        return head;
	    }
	 
	 public ListNode deleteDuplicatesRecursion(ListNode head) {
	     if(head==null||head.next==null) return head;
	     if(head.val==head.next.val) {
	    	 head.next=head.next.next;
	    	 deleteDuplicatesRecursion(head);
	     }
	     else {
	    	 deleteDuplicatesRecursion(head.next);
	     }
	    
	        return head;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesFromSortedList li=new RemoveDuplicatesFromSortedList();
		li.insert(1);
		li.insert(1);
		li.insert(2);
		li.insert(3);
		li.insert(3);
		li.display(li.head);
		
		//ListNode ans=li.deleteDuplicates(li.head);
		ListNode ans=li.deleteDuplicatesRecursion(li.head);
		li.display(ans);
		
	}

}
