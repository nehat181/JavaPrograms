package javaConcepts;

interface Abc{
	
	public void show();
}



public class AnonymousInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc obj=new Abc(){
			public void show()
			{
				
				System.out.println("Anonymous");
			}
		    };
		                obj.show();


		
	}

}
