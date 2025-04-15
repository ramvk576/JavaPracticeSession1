 package javaSession1;

public class SwichCasePractice {

	public static void main(String[] args) 
	{
		String day = "WEDNESDAY";
		
		switch (day = day.toLowerCase()) 
		{
		case "monday":
			System.out.println("Monday is Not a Holiday");		
			break;
		case "tuesday":
			System.out.println("Tuesday is Not a Holiday");		
			break;
		case "wednesday":
			System.out.println("Wed Not a Holiday");		
			break;
		case "thursday":
			System.out.println("Thursday is Not a Holiday");		
			break;
		case "friday":
			System.out.println("Fri is Not a Holiday");		
			break;
		case "saturday":
			System.out.println("Sat is Not a Holiday");		
			break;
		case "sunday":
			System.out.println("It is a Holiday");		
			break;

		default:
			System.out.println("Please pass the correct day");
			break;
		}

	}

}
