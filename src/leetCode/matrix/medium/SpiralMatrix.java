package leetCode.matrix.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> li=new ArrayList<>();
		int top=0; int bottom=matrix.length-1;
		int left=0; int right=matrix[0].length-1;

		while(left<=right&&top<=bottom)
		{
			for(int i=left;i<=right;i++) {
				li.add(matrix[top][i]);
			}
			top++;
			for(int j=top;j<=bottom;j++) {
				li.add(matrix[j][right]);
			}
			right--;
			if(top<=bottom) {
				for(int k=right;k>=left;k--) {
					li.add(matrix[bottom][k]);
				}
				bottom--;  
			}
			if(left<=right) {
			for(int l=bottom;l>=top;l--) {
				li.add(matrix[l][left]);
			}
			left++;
			}
		}
		return li;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] q= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	//	int [] [] q= {{3},{2}};
		List<Integer> li=spiralOrder(q);
		System.out.println(li);

	}

}
