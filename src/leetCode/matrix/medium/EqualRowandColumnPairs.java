package leetCode.matrix.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EqualRowandColumnPairs {

	public int equalPairs(int[][] grid) {

		int count=0;
		 HashMap<Integer, ArrayList<Integer>> row=new HashMap<>();
	     
			for(int i=0;i<grid.length;i++) {
				row.put(i,new ArrayList<>());
				for(int j=0;j<grid[0].length;j++) {
					row.get(i).add(grid[i][j]);
				}
			}
			HashMap<Integer, ArrayList<Integer>> col=new HashMap<>();
			for(int i=0;i<grid[0].length;i++) {
				col.put(i,new ArrayList<>());
				for(int j=0;j<grid.length;j++) {
					col.get(i).add(grid[j][i]);
				}
				
			}
			
			for(Map.Entry<Integer, ArrayList<Integer>> entry1: row.entrySet()) {
				   
				   for(Map.Entry<Integer, ArrayList<Integer>> entry2: col.entrySet()) {
				      
				       if(entry1.getValue().equals(entry2.getValue())) count++;
				   }
				}
						
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] [] nums= {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
		int [] [] nums= {{11,1},{1,11}};
		System.out.println(new EqualRowandColumnPairs().equalPairs(nums));
	}

}
