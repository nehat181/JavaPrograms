package designPatternFactoryMethod;

public abstract class Plan {
	protected double rate;
	
	abstract void getRate();
	
	public void calculateBills(int units){
		
		System.out.println(units*rate);
	}

}
