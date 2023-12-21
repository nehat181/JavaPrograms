package leetCode.linkedlist.medium;

public class ReverseNodesinEvenLengthGroups {
	
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
	
	public ListNode reverse(ListNode node){
        ListNode curr=node;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;   
        }
        return prev;
    }
    public ListNode reverseEvenLengthGroups(ListNode head) {
    	if(head==null&&head.next==null) return head;
       ListNode temp=head;
       ListNode prev=head;
       
       int len=1;;
       
       while(temp.next!=null){
             len++;
             int nodes=0;
           while(temp.next!=null&&nodes<len){
        	  temp=temp.next;
        	  nodes++;
        	 
           }
           ListNode next=temp.next;
           if(nodes%2==0) {
        	   ListNode listToReverse=prev.next;
        	   ListNode trav=listToReverse;
        	   while(trav!=temp) {
        		   trav=trav.next;
        	   }
        	   trav.next=null;
        	   
        	   ListNode rev=reverse(listToReverse);
        	   prev.next=rev;
        	   while(rev.next!=null) {
        		   rev=rev.next;
        	   }
        	   rev.next=next;
        	   
        	   temp=rev;
        	   prev=temp;
           }
           else {
        	  for(int i=0;i<nodes;i++) {
        		  prev=prev.next;
        	  }
           }
         
       }

        return head;
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNodesinEvenLengthGroups li=new ReverseNodesinEvenLengthGroups();
		li.insert(5);
	    li.insert(2);
		li.insert(6);
		li.insert(3);
		li.insert(9);
		li.insert(1);
		li.insert(7);
		li.insert(3);
		li.insert(8);
		li.insert(4);
		li.display(li.head);
		
		ListNode ans=li.reverseEvenLengthGroups(li.head);
		li.display(ans);

	}

}
