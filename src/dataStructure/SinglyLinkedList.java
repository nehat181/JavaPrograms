package dataStructure;

import java.util.ArrayList;

public class SinglyLinkedList {

	
 Node head=null;
	Node tail=null;
	
 class	Node{
	 Node next;
	 int data;
	 
	public Node(int data) {
		this.data=data;
		this.next=null;
		
	}
	 
	 
 }
 
 public void insert(int data) {
	 Node newNode=new Node(data);
	
	 if(head==null) {
		 head=newNode;
		 tail=newNode;
	 }
	 else {
		 tail.next=newNode;
		 tail=newNode;
	 }
	 
	 
 }
 
 public void display() {
	 Node current=head;
	 System.out.print("Nodes are: ");
	 if(current==null) {
		 System.out.println("List is Empty");
		 return;
	 }
	 
	 else {
		 while(current!=null) {
			 System.out.print(current.data+" ");
			 
             current=current.next;
			 
		 }
		 System.out.println("");
		 
		 
	 }
	 
	 
 }
 
 void deleteFromMid() {  
	 
	 Node current=head;
	 int mid=1;
	 int i=0 ;
	 while(i<mid) {
		 
		 current=current.next;
		 i++;
		 
		 
	 }
 }
	
	 
	   public Node removeElements(Node head, int val) {
	        
	        if(head==null){ return head;}
	         while(head!=null&&head.data==val){ 
	           
	            head=head.next;
	            
	        }  
	       
	        
	        Node temp=head;
	        Node prev=null;
	        
	        while (temp != null)  
	        {  
	        
	        if(temp.data!=val){
	            
	            
	                prev=temp;
	            temp=temp.next;
	                
	            }
	            else{
	            prev.next=temp.next;
	            temp=prev.next;
	            }
	        }
	        
	             return head; 
	        }
	        
	 
 
 
 public void deleteFromStart() { 
	 Node current=head;
	 
	 if(current==null) {
		 System.out.println("List is empty");
	 }
	 System.out.println("Updated List");
	 while(current!=null) {
	  head=current.next;
	  current=head;
	  display();
	 
	 
	 }
 }
 
 public int countNodes() {
	 int count=0;
	 
	 Node current=head;
	
	 while(current!=null) {
		 current=current.next;
		 count++;
		 
	 }
	 
	 
	 
	 return count;
 }
 
 public boolean isPalindrome(Node head) {
	 
	 if(head==null) return false;
	 if(head.next==null) return false;
	 
	 Node temp=head;
	 
	 
	 while(temp.next!=null) {
		 temp=temp.next;
		 
	 }
	 if( head.data!=temp.next.data) {
		return false;
		 }
	 temp.next=null;
	 
	 
	 
	return true;
	 
	 
 }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  SinglyLinkedList obj=new SinglyLinkedList();
		  obj.insert(1); 
		  obj.insert(2);
		  obj.insert(2);
		  obj.insert(1);
		 
		 // obj.removeElements( 3);
		  obj.display(); 
		//  System.out.println("Node Count: "+c); obj.deleteFromStart();
		 
		
	        }
	}

