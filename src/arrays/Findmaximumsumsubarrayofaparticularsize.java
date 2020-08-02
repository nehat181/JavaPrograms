
package arrays;

public class Findmaximumsumsubarrayofaparticularsize{
	
	
	public static void findmaxsum(int [] arr,int sub){
			
		int max=0;
		int sum=0;
		int start=0;
		int end=sub;
		
	
		for(int i=0;i<sub;i++) {
			
			sum+=arr[i];
		}
		
		while(start<end) {
		if(sum>max) {
			max=sum;
		}
		if(end>=arr.length) {
			break;
		}
		
		sum-=arr[start];
		sum+=arr[end];
		start++;
		end++;
		
		
		
		
		}
		System.out.println(max);
		
		
	}
	
	
	public static void main(String[] args) {
		int arr[]={2, 3, 4, 5, 7};//16
		int k=3;
		int[] arr1={1, 4, 2, 10, 23, 3, 1, 0, 20};//39
		int k1=4;
		int[] arr2={100, 200, 300, 400};//700
		int k2=2;
		
		
		
		
		findmaxsum(arr2,k2);
		
		
		
	}

}
