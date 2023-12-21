package leetCode.linkedlist.medium;

import java.util.HashMap;

public class CloneListWithARandomPointer {
	Node head=null;
	public static class Node {
		int val;
		Node next;
		Node random;

		Node(int val) { 
			this.val = val; 
			this.next = null;
			this.random=null;
		}
	}

	public void display(Node head) {
		Node temp=head;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		while(temp!=null) {
			System.out.print("-->"+temp.val+" "+temp.random.val);
			temp=temp.next;

		}
		System.out.println();
	}

	public Node copyRandomList(Node head) {

		HashMap<Node,Node> hm=new HashMap<>();
		for( Node curr=head;curr!=null;curr=curr.next) {
			hm.put(curr, new Node(curr.val));
		}

		for(Node curr=head;curr!=null;curr=curr.next) {
			hm.get(curr).next=hm.get(curr.next);
			hm.get(curr).random=hm.get(curr.random);
		}

		Node newList=hm.get(head);


		return newList;

	}

	public Node copyRandomListOptimized(Node head) {

		Node curr=head;
		while(curr!=null){
			Node newNode=new Node(curr.val);
			newNode.next=curr.next;
			curr.next=newNode;
			curr=curr.next.next;
		}
		for(curr=head;curr!=null;curr=curr.next.next) {
			if(curr.random!=null) {
				curr.next.random=curr.random;
			}
			else 
				curr.next.random=null;
		}
		display(head);

		Node org=head;
		Node copy=head.next;
		Node temp=copy;
		while(org!=null&&copy!=null) {
			if(org.next.next==null) {
				org.next=null;
			}
			else {
				org.next=org.next.next;
			}
			if(temp.next==null) {
				temp.next=null;
			}
			else {
				temp.next=temp.next.next;
			}
			org=org.next;
			temp=temp.next;
		}
		return copy;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.random = head.next.next;
		head.next.random = head;
		head.next.next.random = head.next.next.next.next;
		head.next.next.next.random = head.next.next;
		head.next.next.next.next.random = head.next;
		CloneListWithARandomPointer obj=new CloneListWithARandomPointer();
		obj.display(head);

		//		Node ans=obj.copyRandomList(head);
		//		obj.display(ans);

		Node ans=obj.copyRandomListOptimized(head);
		obj.display(ans);
	}

}
