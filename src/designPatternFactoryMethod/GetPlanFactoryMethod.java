package designPatternFactoryMethod;

public class GetPlanFactoryMethod  {
	
	
	
	public Plan getPlan(String planType){
		
		
		if(planType.equalsIgnoreCase("Domestic"))
		{
			
			return new DomesticPlan();
			
		}
		
		
		if(planType.equalsIgnoreCase("Commercial"))
		{
			
			return new Commercial();
			
		}
		
		return null;
		
		
		 
	}

}
