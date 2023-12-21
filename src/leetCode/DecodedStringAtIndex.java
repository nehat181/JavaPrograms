package leetCode;

import java.util.LinkedList;
import java.util.Queue;


public class DecodedStringAtIndex {

public static String decodeAtIndex(String s, int k) {
        String ans="";
        StringBuffer sb=new StringBuffer();
        StringBuffer sb1=new StringBuffer();
        String word="";
        
       String[] str= s.split("\\d");
       Queue<String> st=new LinkedList<>();
       for(int i=0;i<str.length;i++) {
    	   st.add(str[i]);
       }
       
       for(int i=0;i<s.length();i++) {
    	  int num=0;
    	   if(Character.isDigit(s.charAt(i))) {
    		   char d=s.charAt(i);
    		    num=d-'0';
    		    word=st.poll();
    		    sb1=sb.append(word);
    		    
    		   
    	   }
    	   
    	   for(int j=0;j<num-1;j++) {
    		  
    		   sb.append(sb1);
    	   }
       }
        
        char c=sb.charAt(k-1);
        return String.valueOf(c);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leet2code3"; int k = 10;
		String ans=decodeAtIndex(s, k);
		System.out.println(ans);
	}

}
