package arrays;

public class StockBuyAndExchange {

	public static void main(String[] args) {
		int [] val={1,5,3,8,12};
		
		int min[]=new int[val.length/2];
		int max[]=new int[val.length/2];
		min[0]=val[0];
		int minval;
		int maxval;
		
		for(int i=1;i<val.length;i++){
			if(val[i]<val[i-1]){
				
				//minval=val[i];
				min[i-1]=val[i];
				
			}
			
			
			
		}
		
		

	}

}
