package leetCode.Array.Easy;

public class ReverseString {

	public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        char c;
        while(start<end){
        c=s[start];
        s[start]=s[end];
        s[end]=c;
        start++;
        end--;
        }
        System.out.println(s);
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs=new ReverseString();
		char [] c= {'h','e','l','l','o'};
		rs.reverseString(c);
	}

}
