package leetCode;

public class PalindromeNumberRecursion {
	
	 public static boolean isPalindrome(int x) {
		 boolean flag=true;
	        String val=String.valueOf(x);
	        int l=0; int r=val.length()-1;
	        while(l<r){
	            if(val.charAt(l)!=val.charAt(r)){
	               return false;
	            }
	            l++;
	            r--;
	        }

	      return flag;  
	    }
	 
	 public static boolean isPalindromeRec(int x) {
		
		return recur(x,0,String.valueOf(x).length()-1 ); 
				
	    }
	 
	 public static boolean recur(int x, int l, int r) {
		 
				 
		 if(String.valueOf(x).charAt(l)!=String.valueOf(x).charAt(r)) {
			 return false;
			 
		 } 
		 if(l>=r) return true;
		 
		 return recur(x,l+1,r-1);
		 
	 }
	    
	    	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //  System.out.println(isPalindrome(121));
      System.out.println(isPalindromeRec(1221));
	}

}
