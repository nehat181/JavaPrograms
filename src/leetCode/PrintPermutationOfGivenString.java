package leetCode;

public class PrintPermutationOfGivenString {

	public static void printPermutation(String val) {
		recur(val,0,val.length()-1);
	}
	
	public static void recur(String val,int l,int r) {
		
		if(l==r) {
			System.out.println(val);
	}
		else
			
		for(int i=l;i<=r;i++) {
			val=swap(val,l,i);
			recur(val,l+1,r);
			val=swap(val,l,i);
			
			
		}
	}
	
	public static String swap(String s, int i,int j) {
		
		char temp=s.charAt(i);
		char[] ans=s.toCharArray();
		ans[i]=s.charAt(j);
		ans[j]=temp;
		return String.valueOf(ans);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPermutation("abc");
		
		
		
	}

}
