package ds;

import java.util.HashSet;

public class PermutationInString
 {
	
	 static HashSet<String> hs=new HashSet<>();
	 public static boolean checkInclusion(String s1, String s2) {
		 boolean flag= perm(s1,s2,0,s1.length()-1);
	      
//	      Iterator<String> it=hs.iterator();
//	        while(it.hasNext()) {
//	        	if(s2.contains(it.next())) {
//	        		return true;
//	        	}
//	        }
	        return flag;
	      
	    }
	    public static boolean perm(String s1, String s2, int l,int r) {
	    	boolean flag=false;
	        if(l==r){
	        	if(s2.contains(s1)) {
	        	 flag=true;
	        	// return flag;
	        	}
	            }
	                
	     else
	        for(int i=l;i<=r;i++){
	         s1= swap(s1,l,i);
	        
	         perm(s1,s2,l+1,r);
	         s1=swap(s1,l,i);
	         if(flag==true) return true;
	    }
	        return flag;
	   
	    }
	    public static String swap(String s, int i,int j){
	        char temp=s.charAt(i);
	        char[] ans= s.toCharArray();
	        ans[i]=s.charAt(j);
	        ans[j]=temp;
	        return String.valueOf(ans);
	    }
	   public static void main(String[] args) {
	    
		   System.out.println(checkInclusion("ab","eidbaooo"));;
	    }
}
