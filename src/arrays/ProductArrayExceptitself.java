package arrays;

public class ProductArrayExceptitself {
	
	
	public static void product(int arr[]){
		
		int pro=1;
		
		for(int i=0;i<arr.length;i++){
			
		
			pro=pro*arr[i];
			
		}
		
		for(int i=0;i<arr.length;i++){
			
			
			int newPro=(pro/arr[i]);
			System.out.print(newPro+",");
		
		
	}
	}
	/*O(n) Time Complexity and O(n) Space Complexity*/
	public static void product1(int arr[]){
		
		int left[]=new int[arr.length];
		int right[]=new int[arr.length];
		
		left[0]=1;
		right[arr.length-1]=1;
		for(int i=1;i<arr.length;i++){
			
			left[i]=arr[i-1]*left[i-1];
		}
		
		
        for(int i=arr.length-2;i>=0;i--){
			
			right[i]=arr[i+1]*right[i+1];
		}
		
		int prod[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) 
        {
            prod[i] = left[i] * right[i]; 
        }
  
        /* print the constructed prod array */
        for (int i = 0; i < arr.length; i++) {
            System.out.print(prod[i] + " "); 
        }
        return; 
    } 
	/*time-O(n)
	space-O(1)*/
	public static void product2(int arr[]){
	
		
		
		int prod[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			prod[i]=1;
		
		}
		
		int temp=1;
		for(int i=0;i<arr.length;i++){
			prod[i]=temp;
			temp=temp*arr[i];
		}
		temp=1;
		for(int i=arr.length-2;i>=0;i--){
			temp=temp*arr[i+1];
			prod[i]=prod[i]*temp;
			
			
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(prod[i]+",");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 3, 5, 6, 2};
		product(arr);
		System.out.println();
		product1(arr);
		System.out.println();
		product2(arr);
		
	}

}
