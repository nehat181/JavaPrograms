package Ajio;

import java.util.Arrays;

public class XorAllElements {
	int s=10;
	 // function to construct new array 
    static void constructXOR(int A[], int n) 
    { 
          
        // calculate xor of array 
        int XOR = 0; 
        for (int i = 0; i < n; i++) 
            XOR ^= A[i]; 
      
        // update array 
        for (int i = 0; i < n; i++) 
            A[i] = XOR ^ A[i]; 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//        int A[] = { 2, 4, 1, 3, 5}; 
//        int n = A.length; 
//        constructXOR(A, n); 
//      
//        // print result 
//        for (int i = 0; i < n; i++) 
//            System.out.print(A[i] + " "); 
		
		int[] arr = {-2,2,3};

		int closestIndex = 0;
		int diff = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; ++i) {
		    int abs = Math.abs(arr[i]);
		    if (abs < diff) {
		        closestIndex = i;
		        diff = abs;
		    } else if (abs == diff && arr[i] > 0 && arr[closestIndex] < 0) {
		        //same distance to zero but positive 
		        closestIndex =i;
		    }
		}   
		System.out.println(arr[closestIndex ]);
    } 
	}


