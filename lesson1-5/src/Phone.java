
public class Phone {

	int weight;
	boolean turnedOn = false;
	String color = "Blue"; 
	
	static double versionNumber = 2.2;
	
	void togglePowerButton(boolean turnedOn)
	{
		if(turnedOn == true)
		{
			turnedOn = false;
		}
		
		if(turnedOn == false)
		{
			turnedOn = true;
		}
	}
}
