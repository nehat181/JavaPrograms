package arrays;

public class SegregatezeroesandOnes {
	
	
	public static void meth1(int arr[],int n){
		
		int count=0;
		for(int i=0;i<n;i++){
			if(arr[i]==0){
				count++;
			}
		}
		for(int i=0;i<count;i++){
			arr[i]=0;
		}
		for(int i=2;i<n;i++){
			arr[i]=1;
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = new int[]{ 0, 1, 0, 1, 1, 1 }; 
		 meth1(arr,arr.length);
	        
	}

}
