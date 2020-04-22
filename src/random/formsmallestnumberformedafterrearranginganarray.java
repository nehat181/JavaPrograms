package random;

public class formsmallestnumberformedafterrearranginganarray {
	
	
	
	public static int [] sort(int[] arr,int n){
		
		
		
		//int[] input= {1, 2, 1, 12, 33, 211, 50};//111221123350
		
		//2 1---21>12
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
					String A=String.valueOf(arr[i]);
						String B=String.valueOf(arr[j]);
						if((A+B).compareTo(B+A)>=1){
							int temp=arr[j];
							arr[j]=arr[i];
							arr[i]=temp;
			
						}
			}
	}	
						
		
				
		return arr;
	}
	
	

	public static void main(String[] args) {
		
		//int[] input={5,6,2,9,21,1};//1212569
		int[] input= {1, 2, 1, 12, 33, 211, 50};
		
		int [] out=sort(input,input.length);
		for(int i=0;i<out.length;i++){
			System.out.print(out[i]);
		}
		
		
		//1123457
		
	
}
	}

