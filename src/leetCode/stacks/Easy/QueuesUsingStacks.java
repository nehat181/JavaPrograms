package leetCode.stacks.Easy;

import java.util.Stack;

public class QueuesUsingStacks {

	Stack<Integer> s1=new Stack<Integer>();
    Stack<Integer> s2=new Stack<Integer>();
    int size;
    public QueuesUsingStacks() {
        size=0;
    }
    
    public void push(int x) {
    	size++;
        while(!s1.isEmpty()){
          s2.push(s1.pop());
        }
        
        s1.push(x);
        while (!s2.isEmpty()) 
        { 
            s1.push(s2.pop());
        } 
    }
    
    public int pop() {
        if(s1.isEmpty()) return -1;
        return s1.pop();
    }
    
    public int peek() {
           if(s1.isEmpty()) return -1;
        return s1.peek();
    }
    
    public boolean empty() {
        if(s1.isEmpty()) return true;
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueuesUsingStacks obj = new QueuesUsingStacks();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		int param_2 = obj.pop();
		obj.push(5);
		int param_3 = obj.pop();
		int param_4 = obj.pop();
		int param_5 = obj.pop();
		int param_6 = obj.pop();
		
	}

}
