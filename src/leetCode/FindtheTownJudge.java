package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class FindtheTownJudge {

	
	  public static int findJudge1(int N, int[][] trust) {
		  int num=0;
		  if(N==1)return 1;
		  if(trust.length==1) return trust[0][1];
		  if(N==1)return 1;
		  
		  LinkedList<Integer> s1=new LinkedList<>();
		  LinkedList<Integer> s2=new LinkedList<>();
		  
		  for(int i=0;i<trust.length;i++) {
			  
			  s1.add(trust[i][0]);
			  s2.add(trust[i][1]); 
		  }
		  int size=s2.size();
		  Iterator<Integer> it=s1.iterator();
		  while(it.hasNext()) {
			  int i=it.next();
			  Iterator<Integer> it2=s2.iterator();
			  while(it2.hasNext()) {
				  int y=it2.next();
			  if(i==y) {
				  it2.remove();			 
			  }
		  }
		  }
		  if(s2.size()==0) return -1;
		  else {
			Iterator<Integer> it2=s2.iterator();
			  while(it2.hasNext()) {
				 num=it2.next();
				 if(s2.size()==N-1) {
					 return num;
			  }
		  }
		  }  
		return -1;
		
	        
	    }
	  
	  public static int findJudge(int N, int[][] trust) {
		  if(trust.length<N-1) return -1;
		  int[] trustBy=new int[N+1];
		  int[] trusts=new int[N+1];
		  for(int [] rel:trust) {
			  trusts[rel[0]]++;
			  trustBy[rel[1]]++;
		  }
		  
		  for(int i=1;i<N+1;i++) {
			  if(trusts[i]==0&& trustBy[i]==N-1) {
				  return i;
				  
			  }
		  }
		  
		  
		  
		  
		  return -1;
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] trust={{1,2},{3,2}};
		int flag=findJudge(3, trust);
		System.out.println(flag);
	}

}
