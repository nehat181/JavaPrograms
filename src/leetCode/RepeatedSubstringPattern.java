package leetCode;

public class RepeatedSubstringPattern {
	
	public boolean repeatedSubstringPattern(String s) {
		 String str = s + s;
		 System.out.println(str.substring(1, str.length() - 1));
		    return str.substring(1, str.length() - 1).contains(s);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abab";
boolean out=new RepeatedSubstringPattern().repeatedSubstringPattern(str);
System.out.println(out);

	}

}
