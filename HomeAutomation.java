package Java_Tutorials_24_March_2025;
import java.util.Scanner;

public class HomeAutomation {

	public static void main(String[] args) 
	{
		Automation automation = new Automation();
		System.out.println("App is started...");
		while(true)
		{
			System.out.println();
			automation.selectRoom();
			automation.selectAppliances();
			String selectedAppliances = automation.selectAppliances();
			automation.switchButton(selectedAppliances, false);
		} // while
	} // main()
} // HomeAutomation Class

class Automation {

	 Scanner sc = new Scanner(System.in);

	void selectRoom()
	{
		System.out.println("Select the room:\n 1. Hall\n 2. Kitchen\n 3. Master Bed Room\n 4. Second Room \n 5. Exit");
		System.out.println();

		String room = sc.next();
		switch(room)
		{
			case "Hall":
				System.out.println(room + " is selected.");
				break;

			case "Kitchen":
				System.out.println(room + " is selected");
				break;

			case "Master Bed Room":
				System.out.println(room + " is selected");
				break;

			case "Second Room":
				System.out.println(room + " is selected");
				break;

			case "Exit":
				System.out.println("Exit..!");
		
			default:
				System.out.println("Invalid selection..!!");
		} // switch(room)
	} // selectRoom()
	String selectAppliances()
	{
		System.out.println("Select the appliances : \n  1. AC  \n  2. Light  \n  3. TV  \n  4. Fan   \n  5. Exit ");
		String appliances = sc.next();
		boolean isOn = true;

		switch(appliances)
		{
			case "AC":
				switchButton("AC", true);
				return appliances;

			case "Light":
				switchButton("Light", true);
				return appliances;

			case "TV":
				switchButton("TV", true);
				return appliances;

			case "Fan":
				switchButton("Fan", true);
				return appliances;
				
			default:
				 System.out.println("Invalid selection..!");
				 return null;
				 
		}
	}

	void switchButton(String appliances, boolean isOn)
	{
		System.out.println(appliances + " is selected..!");

		if(isOn==false)
		{
			System.out.println(appliances + " is OFF. Do you want to start? (Yes / No)"); 
			String yesNo = sc.next();

			switch(yesNo)
			{
				case "Yes":
					System.out.println( appliances + " is ON..!!");
					//isOn=true;
					break;

				case "No":
					System.out.println("Back to Menu..!!");	
					break;

				case "Exit":
					System.out.println("Back to Menu..!!");	
					break;

			}
		} // If
		else
		{
			System.out.println(appliances + " is ON. Do you want to switch OFF? (Yes / No)"); 
			String yesNo = sc.next();

			Scanner sc = new Scanner(System.in);

			switch(yesNo)
			{										
				case "No":
					System.out.println("Back to Menu..!!");
					break;

				case "Yes":
					System.out.println(appliances + " is OFF..!!");
					//isOn= false;
					break;

				case "Exit":
					System.out.println("Back to Menu..!!");
					break;
			}
		} // else
	}
} // Automation Class

