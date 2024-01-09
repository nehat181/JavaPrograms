package leetCode.stacks.Medium;

import java.util.Stack;

public class AsteroidCollision {
	public int[] asteroidCollision(int[] asteroids) {

		Stack<Integer> st=new Stack<>();
		for(int i:asteroids){
			if(i>=0){
				st.add(i);
			}
			else{
				while(st.size()>0&&st.peek()<Math.abs(i)){
					st.pop();
				}
			}

		}
		
		int size=st.size();
		int [] ans=new int[size];
		for(int i=0;i<size;i++){
			 ans[size-1-i]=st.pop();
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ans= {8,-8};
		System.out.println(new AsteroidCollision().asteroidCollision(ans));

	}

}
