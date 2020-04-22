package important;
import java.util.Stack;

public class findCountofConsecutiveSameElement {
	
	
	public static void test(String s){
		int count=1;
		String output="";
		Stack<Character> st=new Stack<Character>();
		
		for(int i=s.length()-1;i>=0;i--){
			st.push(s.charAt(i));
			
		}
		
		while(!st.empty()){
			char var=st.pop();
			if(st.size()==0){
				output+=Character.toString(var)+String.valueOf(count);
				break;
				
			}
			
			System.out.println(st.size());	
			
			if(!(st.peek()==var)){
				
				output+=Character.toString(var)+String.valueOf(count);
				count=0;
			}
			count++;
			
		}
		System.out.println(output);
	}
	
	public static String consElementCount(String inputString){
		StringBuilder input=new StringBuilder(inputString);
		input.append(0);
		String output="";
		int count=1;
		
		for(int i=0;i<input.length()-1;i++){
			
			if(input.charAt(i)==input.charAt(i+1)){
				count++;
			}
			
			if(!(input.charAt(i)==input.charAt(i+1))){
				
				output+=Character.toString( input.charAt(i)) + Integer.toString(count);
				count=1;
			}
			
		}
		System.out.println(output);
		
		return output;
		
	}

	public static void main(String[] args) {
	String inString="aaabaabbccv";//o-a3b1a2b2c2v1
	consElementCount(inString);
	
	//test(inString);
	/*
	int count = 1;
	String outpString = "";
	inString = inString+0;
	for (int i = 0; i < inString.length()-1; i++) {
		if (inString.charAt(i)!= inString.charAt(i+1)) {
			outpString = outpString + Character.toString( inString.charAt(i)) + Integer.toString(count);
			count = 0;
		}
		count++;
	}*/
	//System.out.println(outpString);
}
}