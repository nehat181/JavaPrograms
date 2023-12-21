package geekForGeeks.selfPaced.Mathematics;

public class GCD {
	/* Eucliclean Algo */
	public static int gcd(int n1,int n2) {
		
		while(n1!=n2) {
			if(n1>n2) {
				n1=n1-n2;
			}
			else{
				n2=n2-n1;}
		}
		return n1;
	}

	
	public static int gcd1(int n1,int n2) {
		int ans=Math.max(n1, n2);
		while(ans>0) {
			if(n1%ans==0&&n2%ans==0) {
				break;
			}
			else {
				ans--;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10, n2=15;// 10, 5    5,5
		System.out.println(gcd(n1,n2));
	}

}
