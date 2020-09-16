package javaConcepts;

interface AB{
	
	 void show(int x);
}



public class FunctionalInterfaceLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AB obj=(int x)->System.out.println("Lambda");
			
		                obj.show(5);
		               

	}

}

