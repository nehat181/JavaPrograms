package leetCode;

public class PrintThePowerSetOfAGivenString {
	
	 public static void printSuperSet(String val) {
			rec(val,0,"");
			 
		 
					
		    }
	 
	 public static void rec(String val, int i, String curr) {
		 if(i==val.length()) {
			 System.out.print(curr+", ");
			 return;
		 }
		 
		 rec(val,i+1,curr+val.charAt(i));
		 rec(val,i+1,curr);
	 }



public static void main(String[] args) {
	// TODO Auto-generated method stub
//  System.out.println(isPalindrome(121));
     printSuperSet("abc");
}

}
