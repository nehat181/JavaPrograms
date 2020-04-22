package designPatternFactoryMethod;

public class GenerateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetPlanFactoryMethod planFactory=new GetPlanFactoryMethod();
		Plan p=planFactory.getPlan("Domestic");
		p.getRate();
		 p.calculateBills(7);  
	}

}
