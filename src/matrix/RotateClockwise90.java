package matrix;

public class RotateClockwise90 {
	
	public static void clockmatrixBigON2(int mat[][],int row,int col){
		for(int j=0;j<col;j++)
		{
		for(int i=row-1;i>=0;i--)
		{
		
			System.out.print(mat[i][j]);
			System.out.print(" ");
		}
		System.out.println();
		
	}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int [][]mat={{0,1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14,15}};
	clockmatrixBigON2(mat,4,4);
	
	
	
	}

}
