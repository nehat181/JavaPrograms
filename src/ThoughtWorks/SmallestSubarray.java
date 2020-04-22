package ThoughtWorks;

import java.util.ArrayList;

public class SmallestSubarray {


	public static int smallest(int arr[],int x,int n){

		int min = n+1;;
		int start=0;
		int end=0;

		for(int i=0;i<n;i++){
			start=i;
			int sum=0;
			sum=sum+arr[i];
			for(int j=i+1;j<n;j++){
				end=j;
				sum=sum+arr[j];
				if(sum>x&&(end - start + 1) < min)
					min=end - start + 1;			 

			}



		}  


		return min;
	}


	public static void prefixSumSolution (int[] arr,int x,int n){
		int len=n+1;
		int sum=0;
		int curr = 0,start=0,end=0,i=0;
		while(end<n){
           while(sum<=x&&end<n){
				sum+=arr[end];
				end++;
				while((sum>x)){	
					curr=end-start;
					if(curr<len){
						len=curr;
						}		
					sum-=arr[start];
					start++;
					
				}		
			}

		}
		System.out.println(len);
	}






		public static void main(String[] args) {
			// TODO Auto-generated method stub
			/* int [] input={1, 4, 45, 6, 0, 19};
	int len=smallest(input,51,input.length);*/
		//	int [] input={1,10,3,40,18};
			//	int len=smallest(input,50,input.length);
			//prefixSumSolution (input,50,input.length);
			
			int [] input={1, 4, 45, 6, 0, 19};
			prefixSumSolution (input,51,input.length);


			//System.out.println(len);



		}


	}
