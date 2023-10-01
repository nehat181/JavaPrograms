package leetCode;

public class SpiralMatrixII {

	public static int[][] generateMatrix(int n) {

		int left=0,top=0;
		int right=n-1, bottom=n-1;
		int [][] mat=new int[n][n];
		int val=1;

		while(left<=right&&top<=bottom)
		{
			for(int i=left;i<=right;i++) {
				mat[top][i]=val++;
			}
			top++;

			for(int i=top;i<=bottom;i++) {
				mat[i][right]=val++;
			}
			right--;

			for(int i=right;i>=left;i--) {
				mat[bottom][i]=val++;
			}
			bottom--;
			if(left<=right) {
				for(int i=bottom;i>=top;i--) {
					mat[i][left]=val++;
				}
				left++;
			}
		}


		return mat;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int[][] mat=generateMatrix(n);
		System.out.println(mat);
	}

}
