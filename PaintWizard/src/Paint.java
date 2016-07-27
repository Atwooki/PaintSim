
public class Paint {
	
	Paint(String Name, double paintPrice, int paintAreaSquared)
	{
		this.areaSquared = paintAreaSquared;
		this.paintName = Name;
		this.price = paintPrice;
	}
	
	private String paintName;
	private double price;
	private int areaSquared;
	public double totalCost;
	
	public void Calculate(int area)
	{
		float tempArea  = area / 10;
		double total  = tempArea  * this.price;
		//System.out.println(total); //debug to see what happens if the math is correct
		
		totalCost = total;
		
	}
	
	
	//would be ove riden in the other paint classes to make this better 
	public String toString()
	{
		return "The best price for you would be " + this.paintName + " at " + this.totalCost ;
	
	}
	
	
	

}
