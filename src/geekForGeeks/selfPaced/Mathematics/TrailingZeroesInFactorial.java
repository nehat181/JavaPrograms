package geekForGeeks.selfPaced.Mathematics;

public class TrailingZeroesInFactorial {

	public static int trailingZeros(int n) {
		int count=0;
		for(int i=5;i<=n;i=i*5) {
			count=count+n/i;
		}
		return count;
	}

	public static int trailingZeros1(int n) {
		int count=0;
		int z=n/5;
		while(z>0) {
			count+=z;
			z=z/5;		
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=251;
		System.out.println(trailingZeros1(n));
	}

}
