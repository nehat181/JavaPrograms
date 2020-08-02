package matrix;

public class RotateClockwise90 {
	
	public static void clockmatrixBigON2(int mat[][],int row,int col){
		
		int n=mat.length;
		for(int i=0;i<n-1;i++) {
			
			for(int j=i;j<n-1;j++) {
				
				
				int temp=mat[i][j+1];
				mat[i][j+1]=mat[j+1][i];
				mat[j+1][i]=temp;
			}
		}
       for(int i=0;i<n;i++) {
			
			for(int j=0;j<n/2;j++) {
				int temp=mat[i][j];
				mat[i][j]=mat[i][n-1-j];
				mat[i][n-1-j]=temp;
				
			}
			}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int [][]mat={{0,1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14,15}};
	
	for(int i=0;i<4;i++) {
		
		for(int j=0;j<4;j++) {
			
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
	}
	clockmatrixBigON2(mat,4,4);
	
for(int i=0;i<4;i++) {
		
		for(int j=0;j<4;j++) {
			
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
	}

//12 8 4 0 
//13 9 5 1 
//14 10 6 2 
//15 11 7 3 

	
	
	
	}

}
