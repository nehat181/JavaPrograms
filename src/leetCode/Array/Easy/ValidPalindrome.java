package leetCode.Array.Easy;

public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		int start=0;
		int end=s.length()-1;
		while(start<end) {
			char l=s.charAt(start);
			char r=s.charAt(end);
			if(!Character.isLetterOrDigit(l)) {
				start++;
			}
			else
				if(!Character.isLetterOrDigit(r)) {
					end--;
				}
				else {
					if(Character.toLowerCase(l)!=Character.toLowerCase(r)) {
						return false;
					}
			start++;
			end--;
				}

		}
		return true;
	}

	public boolean isPalindrome1(String s) {
		StringBuffer sb=new StringBuffer();
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++){
			int as=s.charAt(i)-'a';
			if(as<26&&as>=0) {
				sb.append(s.charAt(i));
			}
		}
		int start=0;
		int end=sb.length()-1;
		while(start<end) {
			if(sb.charAt(start)!=sb.charAt(end)) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A man, a plan, a canal: Panama";
		ValidPalindrome v=new ValidPalindrome();
		System.out.println(v.isPalindrome(s));
	}

}
