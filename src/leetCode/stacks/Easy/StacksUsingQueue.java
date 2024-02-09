package leetCode.stacks.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class StacksUsingQueue {
	
	Queue<Integer> q1=new LinkedList<Integer>();
    Queue<Integer> q2=new LinkedList<Integer>();
    int size;
    public StacksUsingQueue() {
     size=0;   
    }
    
    public void push(int x) {
       size++;
       q2.add(x); 
       while(!q1.isEmpty()){
           q2.add(q1.peek());
           q1.remove();
       }

       Queue<Integer> q=q1;
       q1=q2;
       q2=q;
    }
    
    public int pop() {
       int ele= q1.peek();
       q1.remove();
       size--;
       return ele;

    }
    
    public int top() {
        if(q1.isEmpty()) return -1;
        return q1.peek();
    }
    
    public boolean empty() {
        if(q1.isEmpty()) return true;
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StacksUsingQueue obj = new StacksUsingQueue();
		obj.push(1);
		obj.push(2);
		int param_2 = obj.pop();
		int param_3 = obj.top();
		boolean param_4 = obj.empty();
		
	}

}
