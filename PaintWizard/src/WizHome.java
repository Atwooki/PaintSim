import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class WizHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Paint CheapoMaxPaint = new Paint("CheapoMax", 19.99, 10); // testing new instence of paint to see if this will work fine 
		Paint AverageJoes = new Paint("AverageJoes", 17.99, 15);
		Paint DuluxourousPaints = new Paint("DuluxourousPaints", 25, 10);
		
		 ArrayList<Paint> arrayData = new ArrayList<Paint>();
		 Paint paintList[];
		 paintList = new Paint[3];
		 
		Scanner Sc = new Scanner(System.in);
		System.out.println("What is thearea of the room you wish to paint in Msq: ");
		int AreaOfRoom = Sc.nextInt();
		//arrayData.add(CheapoMax(AreaOfRoom)) ;
		//arrayData.add(AverageJoes(AreaOfRoom));
		//arrayData.add(DuluxourousPaints(AreaOfRoom));
	    // System.out.println(cost);
		CheapoMaxPaint.Calculate(AreaOfRoom);
		AverageJoes.Calculate(AreaOfRoom);
		DuluxourousPaints.Calculate(AreaOfRoom);
		
		//array needs to be made into a loop not hard coded 
		paintList[0] = CheapoMaxPaint;
		paintList[1] = AverageJoes;
		paintList[2] = DuluxourousPaints;
		
		//Collections.sort(arrayData);
		
	int lowestIndex = FindLowestPrice(paintList);
		//System.out.println(arrayData.get(0)+ " Is the best for you");
		System.out.println(paintList[lowestIndex].toString());
		 
	}
	

	private static int FindLowestPrice(Paint[] arrayOfPaint)
	{
		if (arrayOfPaint.length == 0)
		{
			 return 0;
		}
		double small = arrayOfPaint[0].totalCost;
		int index = 0;
		for (int i = 0; i < arrayOfPaint.length; i++)
		    if (arrayOfPaint[i].totalCost < small)
		    {
		        small = arrayOfPaint[i].totalCost;
		        index = i;
		    }
		
		return index;
	}
	
	private static double AverageJoes(int Area)
	{
		float A  = Area / 15;
		double Total  = A  * 17.99;
		System.out.println(Total);
		return Total;
	}
	
	private static double DuluxourousPaints(int Area)
	{
		float A  = Area / 10;
		double Total  = A  * 25;
		System.out.println(Total);
		return Total;
	}

}
