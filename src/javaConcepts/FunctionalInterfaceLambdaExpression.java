package javaConcepts;

interface AB{
	
	 void show();
}



public class FunctionalInterfaceLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AB obj=() ->System.out.println("Lambda");
			
		                obj.show();


	}

}

