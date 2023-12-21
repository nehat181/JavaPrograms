package leetCode.Array.Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfTwoArrays {

	//	public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
	//	{
	//		// add your code here
	//		HashSet<Integer> hs=new HashSet<>();
	//		int index=Math.min(n, m);
	//		
	//		for(int i=0;i<index;i++) {
	//			hs.add(arr1[index]);
	//			hs.add(arr2[index]);
	//		}
	//
	//		return ar;
	//	}

	public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
	{
		// add your code here
		ArrayList<Integer> ar=new ArrayList<>();

		int p1=0;
		int p2=0;

		while(p1<n&&p2<m){
			if(arr1[p1]==arr2[p2]){
				if(!ar.contains(arr1[p1])) {
					ar.add(arr1[p1]);	
				}
				p1++;
				p2++;
			}
			else
				if(arr1[p1]<arr2[p2]&&!ar.contains(arr1[p1])){
					ar.add(arr1[p1]);
					p1++;

				}
				else
					if(arr1[p1]<arr2[p2]&&ar.contains(arr1[p1])){
						p1++;

					}
					else if(arr1[p1]>arr2[p2]&&!ar.contains(arr2[p2]))
					{
						ar.add(arr2[p2]);
						p2++;
					}
					else if(arr1[p1]>arr2[p2]&&ar.contains(arr2[p2])){
						p2++;
					}

		}

		while(n-p1!=0) {
			if(!ar.contains(arr1[p1])) {
				ar.add(arr1[p1]);
			}
			p1++;

		}

		while(m-p2!=0) {
			if(!ar.contains(arr2[p2])) {
				ar.add(arr2[p2]);
			}
			p2++;
		}
		return ar;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	n = 10; int [] arr1 = {1, 2, 3, 4, 4,5,6,7,9,13}  ;
		int m = 5; int [] arr2 = {1, 2, 3,4,4};
		System.out.println(findUnion(arr1, arr2, n, m));
	}

}
