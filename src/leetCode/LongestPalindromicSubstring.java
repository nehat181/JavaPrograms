package leetCode;

public class LongestPalindromicSubstring {
	static int lo;
	static int maxLen;
	public static String longestPalindrome(String s) {
		for (int i = 0; i < s.length(); i++) {
			 extend(s, i, i);//check odd
			extend(s, i, i + 1);//check even
		}
		return s.substring(lo, lo + maxLen);
	}

	static void extend(String s, int left,int right){
		while(left>=0&&right<s.length()&&s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		
		int length = right - left - 1;
        if (length > maxLen) {
            maxLen = length;
            lo = left + 1;
        }
		
	}
	
	public static void main(String[] args) {
		String s="cbbd";
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome(s));
	}

}
