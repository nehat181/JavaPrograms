package leetCode.strings.easy;

public class LargestOddNumberinString {

	public String largestOddNumber(String num) {
		for(int i=num.length()-1;i>=0;i--) {
			if(num.charAt(i)%2!=0) {
				return num.substring(0,i+1);
			}
		}
		return "";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="52";
		System.out.println(new LargestOddNumberinString().largestOddNumber(num));
	}

}
