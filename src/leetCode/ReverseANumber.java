package leetCode;

public class ReverseANumber {

	public int reverse(int x) {
		int num=0;
		int rem=0;
		//x=Math.abs(x);
		while(Math.abs(x)>0)
		{		rem=x%10;
		x=x/10;
		num=num*10+rem;
	
		}
		
		if(num<Integer.MAX_VALUE||num>Integer.MIN_VALUE) {
			return 0;
		}
		return num;
	}


	public static void main(String[] args) {
		int num=1534236469;
		int rev=new ReverseANumber().reverse(num);
		System.out.println(rev);


	}
}
