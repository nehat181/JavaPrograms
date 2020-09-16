package leetCode;

import java.util.Stack;

public class ValidPalindrome {

	public static boolean isPalindrome(String s) {
		
		s=s.toLowerCase();
		Stack<Character> st1=new Stack<Character>();
		Stack<Character> st2=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if((Character.isDigit(c))||(c>='a'&&c<='z')){
			st1.add(c);
		    
			}
			
			
		}
for(int i=s.length()-1;i>=0;i--) {
	char c=s.charAt(i);
	if((Character.isDigit(c))||(c>='a'&&c<='z')){
			st2.add(c);
		    
			}
			
			
		}


  while(!st1.empty()) {
	  
	  if((st1.pop())!=(st2.pop())) {
		  return false;
	  }
	  
  }
		return true;
        
	       
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="A man, a plan, a canal: Panama";
      System.out.println(isPalindrome(s));
	}

}
