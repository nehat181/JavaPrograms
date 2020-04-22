package arrays;

public class TrappingRainWater {

	public static int leftmax(int arr[], int i) {

		int max = 0;
		for (int y = 0; y < i; y++) {

			if (arr[y] > arr[y + 1]) {

				max = arr[y];
			}
		}

		return max;

	}

	public static int righttmax(int arr[], int i) {

		int max = 0;
		for (int y = i; y > arr.length; y++) {

			if (arr[y] > arr[y + 1]) {

				max = arr[y];
			}
		}

		return max;

	}

	public static void UnitofWater(int height[]) {
		 int result = 0;
		int left[] = new int[height.length];
	    int right[]= new int[height.length];
	 
	    //scan from left to right
	    int max = height[0];
	    left[0] = height[0];
	    for(int i=1; i<height.length; i++){
	        if(height[i]<max){
	            left[i]=max;
	        }else{
	            left[i]=height[i];
	            max = height[i];
	        }
	    }
	 
	    //scan from right to left
	    max = height[height.length-1];
	    right[height.length-1]=height[height.length-1];
	    for(int i=height.length-2; i>=0; i--){
	        if(height[i]<max){
	            right[i]=max;
	        }else{
	            right[i]=height[i];
	            max = height[i];
	        }
	    }
		
	    
	    for(int i=0; i<height.length; i++){
	        result=result+ Math.min(left[i],right[i])-height[i];
	    }
	 
	    System.out.println(result);

		}
	
	public  static void calcwater(int arr[]){
		
		
		int left[]=new int[arr.length];
		int right[]=new int[arr.length];
		
		int max=arr[0];
		 left[0]=max;
		for(int i=0;i<arr.length-1;i++){
			
			if(arr[i+1]>max){
				
				max=arr[i+1];
				left[i+1]=max;
				
			}
			
			else{
				
				max=arr[i];
				left[i+1]=max;
			}
		}
		int  max1=arr[arr.length-1];
		 right[arr.length-1]=max1;
		
         for(int i=arr.length-2;i>=0;i--){
			
			if(arr[i]>max1){
				
				max1=arr[i];
				right[i]=max1;
				
			}
			
			else{
				
				
				right[i]=max1;
			}
		}
		int result=0;
         for(int i=0; i<arr.length; i++){
 	        result=result+ Math.min(left[i],right[i])-arr[i];
 	    }
         System.out.println(result);
	}

	public static void main(String[] args) {

		//int arr[] = { 3, 0, 1, 1, 2 };
		int arr[] = { 1, 2, 1,3, 1 };
		calcwater(arr);
		UnitofWater(arr);

	}

}
