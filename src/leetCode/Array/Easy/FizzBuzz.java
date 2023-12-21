package leetCode.Array.Easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
		List<String> ans=new ArrayList<>();
		int fizzCount=0;
		int buzzCount=0;
		for(int i=1;i<=n;i++){
			fizzCount++;
			buzzCount++;
			if(fizzCount==3&buzzCount==5){
				ans.add("FizzBuzz");
				fizzCount=0;
				buzzCount=0;
			}
			else if(fizzCount==3){
				ans.add("Fizz");
				fizzCount=0;
			}
			else if(buzzCount==5){
				ans.add("Buzz");
				buzzCount=0;
			}
			else ans.add(String.valueOf(i));
		}
		return ans;   
	}
	public List<String> fizzBuzz1(int n) {
		List<String> ans=new ArrayList<>();
		int fizzCount=0;
		int buzzCount=0;
		for(int i=1;i<=n;i++){
			fizzCount++;
			buzzCount++;
			if(fizzCount==3&buzzCount==5){
				ans.add("FizzBuzz");
				fizzCount=0;
				buzzCount=0;
			}
			else if(fizzCount==3){
				ans.add("Fizz");
				fizzCount=0;
			}
			else if(buzzCount==5){
				ans.add("Buzz");
				buzzCount=0;
			}
			else ans.add(String.valueOf(i));
		}
		return ans;   
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz fb=new FizzBuzz();
		int n=15;
		System.out.println(fb.fizzBuzz(n));

	}

}
