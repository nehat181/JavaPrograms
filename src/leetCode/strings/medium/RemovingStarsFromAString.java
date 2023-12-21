package leetCode.strings.medium;

import java.util.Stack;

public class RemovingStarsFromAString {
   
	
	public String removeStars2(String s) {
		  Stack<Character> st=new Stack<>();
	        
	       StringBuffer sb=new StringBuffer();
	        for(int i=0;i<s.length();i++){
	          if(s.charAt(i)=='*') {
	           st.pop();
	          }
	          else{
	              st.push(s.charAt(i));
	          }
	        }
	      while(st.size()>0){
	          sb.append(st.pop());
	      }    
	     sb.reverse();
	     return sb.toString();
	}

	public String removeStars(String s) {
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='*') {
				sb.deleteCharAt(sb.length()-1);
			}
			else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
	public String removeStars1(String s) {
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++){
			st.push(s.charAt(i));
		}

		StringBuffer sb=new StringBuffer();
		int count=0;
		while(st.size()!=0){
			while(st.peek()=='*'){
				count++;
				st.pop();
			}
			while(count>0&&st.peek()!='*'){
				st.pop();
				count--; 
			}
			if(st.size()>0&&st.peek()!='*')
				sb.append(st.pop());
		}
		sb.reverse();
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abb*cdfg*****x*";
		System.out.println(new RemovingStarsFromAString().removeStars(s));
		System.out.println("10".compareTo("2"));
	}

}
