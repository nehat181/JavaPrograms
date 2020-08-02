package dataStructure;

import java.util.Stack;

class NodeList{
	
	int val;
	NodeList next;
	
	public NodeList(int val) {
		
		this.val=val;
		this.next=null;
	}
}

public class PalindromeLinkedList {
	
	NodeList head=null;
	NodeList tail=null;
	static int count=0;
	
	
	
	public void insertAtEnd(int data) {
		NodeList node=new NodeList(data);
		
		if(head==null) {
			head=node;
			tail=node;
			count++;
			
		}
		else {
			
			tail.next=node;
			tail=node;
			count++;
			}
			
			
		}
	
	public String findPal() {
		
		NodeList current=head;
		
		Stack<Integer> stack = new Stack<Integer>(); 
		
		while(current!=null) {
			
			stack.add(current.val);
			current=current.next;
		}
		
		
		while(!stack.isEmpty())
		if(head.val==stack.pop()) {
			head=head.next;
				
		}
		else return "Not a Palindrome";
		
		return "Palindrome";
		
	}
	
	
	
public String findPalNoSpace() {
		
		NodeList first=head;
		int mid=0;;
		System.out.println(count/2);
		NodeList second=head;
		while(mid!=(count/2)) {
			second=second.next;
			mid++;
		
			
		}
				
		
		
		
		
		return "Palindrome";
		
	}
		
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeLinkedList obj=new PalindromeLinkedList();
		obj.insertAtEnd(1);
		obj.insertAtEnd(2);
		obj.insertAtEnd(3);
		obj.insertAtEnd(1);
        System.out.println(obj.findPalNoSpace());
	}

}
