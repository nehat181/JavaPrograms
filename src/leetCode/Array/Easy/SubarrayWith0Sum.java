package leetCode.Array.Easy;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWith0Sum {

	static boolean findsum(int arr[],int n)
	{
		//Your code here
		int sum=0;
		Set<Integer> hm=new HashSet<>();
		for(int i=0;i<n;i++){
			sum+=arr[i];
			if(sum==0){
				return true;
			}
			else 
				if(hm.contains(sum)){
					return true;
				}
				else{
					hm.add(sum);
				}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubarrayWith0Sum obj=new SubarrayWith0Sum();
		int[] nums= {4, 2, -3, 1, 6};
		int n=5;
		System.out.println(obj.findsum(nums, n));
	}

}
