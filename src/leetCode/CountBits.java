package leetCode;

public class CountBits {
	public int[] countBits(int n) {
		int result [] = new int[n+1];
		for (int i = 1; i <= n; i++) {
			int div=result[i/2];
			int rem= i%2;
			result[i] = div+rem;
		}
		return result;
	}

	public static void main(String[] args) {
		//int n=2;
		int n=5;//
		int[] out= new CountBits().countBits(n);
		for(int i=0;i< out.length;i++) {
			System.out.print(out[i]);
		}

	}

}
