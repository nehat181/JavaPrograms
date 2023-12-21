package leetCode.strings.easy;

public class Largest3SameDigitNumberInString {

	public String largestGoodInteger(String num) {
		String ans="";
		for(int i=2;i<num.length();i++) {
			if(num.charAt(i)==num.charAt(i-1)&&num.charAt(i)==num.charAt(i-2)) {
		      if(num.substring(i-2, i+1).compareTo(ans)>0) {
		    	  ans=num.substring(i-2, i+1);
		      }
			}
			
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="230001999";
		System.out.println(new Largest3SameDigitNumberInString().largestGoodInteger(num));
		
	}

}
