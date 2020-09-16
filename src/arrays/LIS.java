package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class LIS { 
	  String s;
	 
	 
	 void test(String s) {
		s=s;
		 System.out.println(s);
	 }
	 void disp() {
		 System.out.println(s);
	 }
	 
	int LIS() {
		System.out.println("hello");
		return 2;
	}
    /* lis() returns the length of the longest increasing 
       subsequence in arr[] of size n */
    static int lis(int arr[], int n) 
    { 
        int lis[] = new int[n]; 
        int i, j, max = 0; 
  
        /* Initialize LIS values for all indexes */
        for (i = 0; i < n; i++) 
            lis[i] = 1; 
  
        /* Compute optimized LIS values in bottom up manner */
        for (i = 1; i < n; i++) 
            for (j = 0; j < i; j++) 
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) 
                    lis[i] = lis[j] + 1; 
  
        /* Pick maximum of all LIS values */
        for (i = 0; i < n; i++) 
            if (max < lis[i]) 
                max = lis[i]; 
  
        return max; 
    } 
    
    public Integer[] LIS(int[] A) {
        int[] m = new int[A.length];
        //Arrays.fill(m, 1);//not important here
        for (int x = A.length - 2; x >= 0; x--) {
          for (int y = A.length - 1; y > x; y--) {
            if (A[x] < A[y] && m[x] <= m[y]) {
              m[x]++;//or use m[x] = m[y] + 1;
            }
          }
        }
        int max = m[0];
        for (int i = 1; i < m.length; i++) {
          if (max < m[i]) {
            max = m[i];
          }
        }
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < m.length; i++) {
          if (m[i] == max) {
            result.add(A[i]);
            max--;
          }
        }
        return result.toArray(new Integer[result.size()]);
      }
   
    
  
    public static void main(String args[]) 
    { 
    	 int array[] = {3, 10, 2, 1, 20}; 
         // int array[] = {10, 9, 8, 6, 5, 4}; 
    	 Integer [] out=new LIS().LIS(array);
    	
          for(int i=0;i<out.length;i++) {
        	  System.out.println(out[i]);
          }
          char c='a';
          String s=Character.toString(c);
          System.out.println(s);
          
          String s1="welcome to split world";  
          System.out.println("returning words:");  
        
          for(String w:s1.split("\\s",2)){  
          System.out.println(w);  
          }  
    } 
} 