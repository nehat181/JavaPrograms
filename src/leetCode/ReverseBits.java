package leetCode;

public class ReverseBits {
	
	  public int reverseBits(int n) {
		  int ans = 0;
	        for (int i = 0; i < 32; i++) {
	            ans <<= 1;
	            ans+=n%2;
	            n >>= 1;
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=new ReverseBits().reverseBits(43261596);
System.out.println(num);
	}

}
