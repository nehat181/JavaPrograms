package geekForGeeks.selfPaced.Mathematics;

public class PalinDrome {
	public static boolean isPal(int n) {
		int rev=0;
        int temp=n;
		while(temp>0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		
		if(rev==n) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4554;
		System.out.println(isPal(n));
	}

}
