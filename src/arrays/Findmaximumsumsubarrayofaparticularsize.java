package arrays;

public class Findmaximumsumsubarrayofaparticularsize{
	
	
	public static void findmaxsum(int [] arr,int sub){
		int sum=0;
		int maxsum=0;
		int start=0;
		int end=sub-1;;
		//while(i<arr.length){
		for(int i=0;i<sub;i++){
			sum+=arr[i];
		}
			while(sum>maxsum){
				maxsum=sum;
				sum-=arr[start];
				start++;
				
				end++;
							
				if(end==arr.length){
				break;
				}
				sum+=arr[end];
				
			}
			
			
			
			
		
		//}
		System.out.println("maxsum "+ maxsum);
	}

	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={2, 3, 4, 5, 7};//6
		int k=3;
		int[] arr1={1, 4, 2, 10, 23, 3, 1, 0, 20};//39
		int k1=4;
		int[] arr2={100, 200, 300, 400};//700
		int k2=2;
		
		
		findmaxsum(arr2,k2);
		
		
		
	}

}
