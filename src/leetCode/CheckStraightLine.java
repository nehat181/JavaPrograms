package leetCode;

public class CheckStraightLine {

	
	  public static boolean checkStraightLine(int[][] coordinates) 
	  { 
	  boolean flag=false; 
	  double y1=0;
	  double x1=0;
	  int len=coordinates.length; 
	  if(len>2) {
	   x1=coordinates[1][1]-coordinates[0][1];
	   y1=coordinates[1][0]-coordinates[0][0];
	   
	   
	   
	  }
	 
	 for(int i=2;i<coordinates.length;i++) {
		 double y2=coordinates[i][0]-coordinates[i-1][0];
		 double x2=coordinates[i][1]-coordinates[i-1][1];
	  if(x1*y2==x2*y1) {
	  flag=true;
	  }
	  else {
		  return false;}
	  }
	  
	  return flag;
	  
	  }
	 

	public boolean checkStraightLine1(int[][] coordinates) {
		int[] point1 = coordinates[1];
		int[] point2 = coordinates[0];
		float gSlope = slope(point1, point2);

		for (int i = 1; i < coordinates.length; i++) {
			int[] p1 = coordinates[i];
			int[] p2 = coordinates[0];
			float slop = slope(p1, p2);
			if (gSlope != slop)
				return false;
		}
		return true;
	}

	private float slope(int[] p1, int[] p2) {
		System.out.println((p1[0] - p2[0]));
		if ((p1[0] - p2[0]) == 0)
			return 0;
		return (float) (p2[1] - p1[1]) / (p2[0] - p1[0]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 4, 10 }, { -5, 1 }, { -7, -1 }, { 2, 8 }, { -6, 0 }, { -4, 2 }, { 6, 12 } };

		boolean flag = new CheckStraightLine().checkStraightLine(arr);
		System.out.println(flag);

	}

}
