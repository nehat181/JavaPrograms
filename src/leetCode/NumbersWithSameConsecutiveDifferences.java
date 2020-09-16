package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersWithSameConsecutiveDifferences {
	   public int[] numsSameConsecDiff(int N, int K) {
	        List<Integer> cur = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
	        for (int i = 2; i <= N; ++i) {
	            List<Integer> cur2 = new ArrayList<>();
	            for (int x : cur) {
	                int y = x % 10;
	                if (x > 0 && y + K < 10)
	                    cur2.add(x * 10 + y + K);
	                if (x > 0 && K > 0 && y - K >= 0)
	                    cur2.add(x * 10 + y - K);
	            }
	            cur = cur2;
	        }
	        return cur.stream().mapToInt(j->j).toArray();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] ar=new NumbersWithSameConsecutiveDifferences().numsSameConsecDiff(3,7);
Arrays.sort(ar);

for(int i=0;i<ar.length;i++) {
	System.out.println(ar[i]);
}
	}

}
