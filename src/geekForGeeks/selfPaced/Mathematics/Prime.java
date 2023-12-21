package geekForGeeks.selfPaced.Mathematics;

public class Prime {

	public static boolean isPrime(int n) {
        if (n==2&&n==1) return true;
        
        for(int i=2;i<n/2;i++) {
        	if(n%i==0) return false;
        }
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=65;
		System.out.println(isPrime(n));
	}

}
