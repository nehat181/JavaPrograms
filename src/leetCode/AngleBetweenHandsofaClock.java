package leetCode;

public class AngleBetweenHandsofaClock {
	
	 public double angleClock(int hour, int minutes) {
		 if(hour==12) hour=0;
		 double minAngle = minutes*6;
		 
		 double hourAngle=(hour*30)+(double)minutes/10*5;
		 if(Math.abs(hourAngle-minAngle)>180) {
			 
			 return 360-Math.abs(hourAngle-minAngle);
				 
		 }
		 else {
		 double totalAngle=Math.abs(hourAngle-minAngle);
		 return totalAngle;
		 }
		 
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
double angle=new AngleBetweenHandsofaClock().angleClock(1, 57);
System.out.println(angle);
	}

}
