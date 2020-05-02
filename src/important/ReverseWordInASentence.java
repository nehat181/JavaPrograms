package important;

import java.util.Stack;

public class ReverseWordInASentence{

	
	public static String revWordUsingplit(String s){
		String output="";
		String input=s;
		String[] words=input.split("\\s");
		for(int i=0;i<words.length;i++){
			String word=words[i];
			for(int j=word.length()-1;j>=0;j--){
				output+=word.charAt(j);
				
				
				
			}
			output+=" ";
			
		}
		
		System.out.println(output);
		return output;
	
	}
	
	public static String revWordUsingStack(String s){
		String output="";
		Stack<Character> st=new Stack<Character>(); 
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
		st.push(s.charAt(i));
			}
			
		else{
			//System.err.println(st);
			while(!st.empty()){
			System.out.print(st.pop()); 
		}
			 System.out.print(" "); 
		}
		}
		
		while(!st.empty()){
			System.out.print(st.pop()); 
		}
			 
		return output;
		
		
	}
	
	public static String revWordUsingSB(String s){
		String output="";
	
		String[] words=s.split("\\s");
		for(int i=0;i<words.length;i++){
						
			StringBuffer sb=new StringBuffer(words[i]);
			output+=sb.reverse().toString()+" ";
			
		}
				
		System.out.println(output.trim());
		return output;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//revWordUsingplit("Can you reverse this");
		revWordUsingStack("Can you reverse this");
		//revWordUsingSB("Can you reverse this");
		
	}

}
