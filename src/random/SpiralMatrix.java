package random;

public class SpiralMatrix {
	
	static void spi(int a[][],int i,int j,int p,int k){
		
		
			
			for(int x=i;x<k;x++){
				
				System.out.print(a[i][x]+" ");
				
					
				}
			
			for(int x=i+1;x<p;x++){
				
				System.out.print(a[x][k-1]+" ");
				//System.out.print(" ");
			}
			
			if((p-1)!=i){
            for(int x=k-2;x>=0;x--){
				
				System.out.print(a[p-1][x]+"  ");
			//	System.out.print(" ");
			}
			}
            
            if(j!=(k-1)){
            for(int x=p-2;x>0;x--){
				
				System.out.print(a[x][j]+" ");
			//	System.out.print(" ");
			}
            
            spi(a,i+1,j+1,p-1,k-1);
            }
       
            
            
            
          
          
			
		
            }
			
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = { { 1, 2, 3, 4 }, 
                      { 5, 6, 7, 8 }, 
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16}}; 
		
		/*for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				
				System.out.print(a[i][j]);
				System.out.print(" ");
				
				
			}
			System.out.println(" ");
			
			
		}*/
		
		spi(a,0,0,4,4);

	}
	
	

}
