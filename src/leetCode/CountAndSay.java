package leetCode;

public class CountAndSay {

	static String ans="";
	public static String countAndSay(int n) {

		String inp="1";
		while(n>1) {
	    inp=recur(inp);
	    n--;
		}
		
		return inp;

	}
	
	public static String recur(String s) {

		StringBuffer sb=new StringBuffer();
		int count=1;
		char c=s.charAt(0);
		for(int i=1;i<s.length();i++) {
			if(c==s.charAt(i)) {
				count++;
			}
			else {
				sb.append(count);
                sb.append(c);
				c=s.charAt(i);
				
				count=1;
			}
		}
			
			sb.append(count);
			sb.append(c);
			
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		System.out.println(countAndSay(n));
	}

}
