package leetCode.strings.medium;

import java.util.Stack;

public class RemoveAllOccurencesOfASubstring {

	public String removeOccurrences1(String s, String part) {
		while(s.contains(part)){
			s=s.replaceFirst(part,"");
		}
		return s;
	}

	public String removeOccurrences(String s, String part) {
		Stack<Character> st=new Stack<>();
	     int m=s.length();
	     int n=part.length();
	     for(int i=0;i<m;i++)
	     {
	      st.push(s.charAt(i));
	      if(st.size()>=n){
	    	  String x="";
	          for(int j=n-1;j>=0;j--){
	              char c=part.charAt(j);
	              if(st.peek()!=c){
	            	  for(int k=0;k<x.length();k++) {
	            		  st.push(x.charAt(k));
	            	  }
	                  break;
	              }
	              else{
	              x=st.peek()+x;
	               st.pop();   
	              }
	          }
	      }
	     }
	     StringBuilder sb=new StringBuilder();
	     while(st.size()!=0){
	         sb.append(st.pop());
	     }   
	     sb.reverse();
	     return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ixcupqoixcupqokevnpokevnpoknqywmlhevgc";
		String part="ixcupqokevnpo";

		System.out.println(new RemoveAllOccurencesOfASubstring().removeOccurrences(s, part));
	}

}
