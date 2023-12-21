package leetCode.Array.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderInAnArray {

    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
    	 ArrayList<Integer> ans =new ArrayList<Integer>();
         int out=Integer.MIN_VALUE;
         for(int i=n-1;i>=0;i--){
             if(arr[i]>=out){
                 ans.add(arr[i]);
                 out=arr[i];
             }
             
         }
         Collections.reverse(ans);
         return ans;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {16 ,17, 4, 3, 5, 2};
     int n=6;
     System.out.println(new LeaderInAnArray().leaders(arr, n));
	}

}
