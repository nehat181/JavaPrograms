package leetCode.linkedlist.medium;

public class AddTwoNumbers {
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
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode li1=l1;
        ListNode li2=l2;
        ListNode out=new ListNode();
        ListNode node=out;
        int num=0;
        int carry=0;
        ListNode v=null;
        while(li1!=null&&li2!=null){
            num=li1.val+li2.val+carry;
            carry=num/10;
            v=new ListNode(num%10);
            node.next=v;
            node=node.next;
            li1=li1.next;
            li2=li2.next;
        }
        while(li1!=null) {
        	num=li1.val+carry;
        	carry=num/10;
        	v=new ListNode(num%10);
        	node.next=v;
        	node=node.next;
        	li1=li1.next;     	
        }
        while(li2!=null) {
        	num=li2.val+carry;
        	carry=num/10;
        	v=new ListNode(num%10);
        	node.next=v;
        	node=node.next;
        	li2=li2.next;	
        }
        if(carry>0) {
        	node.next=new ListNode(carry);
        }
       return out.next; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddTwoNumbers l1=new AddTwoNumbers();
//		l1.insert(2);
//		l1.insert(4);
//		l1.insert(3);
//		l1.insert(9);
		l1.insert(9);
		l1.insert(9);
		l1.insert(9);
		l1.insert(9);
		l1.insert(9);
		l1.insert(9);
		l1.insert(9);
		l1.display(l1.head);
		
		AddTwoNumbers l2=new AddTwoNumbers();
//		l2.insert(5);
//		l2.insert(6);
//		l2.insert(4);
		l2.insert(9);
		l2.insert(9);
		l2.insert(9);
		l2.display(l2.head);
		
		ListNode ans=l1.addTwoNumbers(l1.head, l2.head);
		l2.display(ans);
		
		
	}

}
