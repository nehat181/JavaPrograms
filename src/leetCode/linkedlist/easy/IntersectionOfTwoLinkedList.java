package leetCode.linkedlist.easy;


public class IntersectionOfTwoLinkedList {

	static class ListNode {
		int data;
		ListNode next;
		ListNode(int d)
		{
			data = d;
			next = null;
		}
	}
	public void display(ListNode head) {
		ListNode temp=head;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode l1=headA;
		int len1=0;
		ListNode l2=headB;
		int len2=0;
		ListNode ans=null;
		while(l1!=null||l2!=null){
			if(l1!=null){
				len1++;
				l1=l1.next;
			}
			if(l2!=null){
				len2++;
				l2=l2.next;
			}
		}
		l1=headA;
		l2=headB;
		System.out.println(len1+" "+len2);
		if(len2>len1){
			for(int i=0;i<(len2-len1);i++){
				l2=l2.next;
			}
		}
		else{
			for(int i=0;i<(len1-len2);i++){
				l1=l1.next;
			}
		}
		while(l2!=null){
			if(l1==l2){
				ans=l1;
				return ans;
			}
			else{
				l1=l1.next;
				l2=l2.next;
			}
		}
		return ans;
	}
	
	public ListNode getIntersectionNodeOptimized(ListNode headA, ListNode headB) {
        ListNode l1=headA;
        ListNode l2=headB;
        while(l1!=l2){
            if(l1==null){
                l1=headB;
            }
            else{
                l1=l1.next;
            }
            if(l2==null){
                l2=headA;
            }
           else{
            l2=l2.next;
           }
        }
       return l1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntersectionOfTwoLinkedList ob=new IntersectionOfTwoLinkedList();
		ListNode head1, head2;
		head1 = new ListNode(10);
		head2 = new ListNode(3);

		ListNode newListNode = new ListNode(6);
		head2.next = newListNode;

		newListNode = new ListNode(9);
		head2.next.next = newListNode;

		newListNode = new ListNode(15);
		head1.next = newListNode;
		head2.next.next.next = newListNode;

		newListNode = new ListNode(30);
		head1.next.next = newListNode;

		head1.next.next.next = null;
		ob.display(head1);
		ob.display(head2);

		System.out.println(new IntersectionOfTwoLinkedList().getIntersectionNodeOptimized(head1, head2));
	}

}
