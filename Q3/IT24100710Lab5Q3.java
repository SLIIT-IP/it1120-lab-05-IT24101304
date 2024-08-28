import java.util.Scanner;

public class IT24100710Lab5Q3
{
	public static final double RCPD = 48000.0;
	public static void main(String[]arg)
	{
		//Start Date = SD , End Date = ED , Room Charge Per Day = RCPD , Number of Days Reserved = NDR , Total Amount to be Paid = TAP 	
		
		int SD,ED,NDR;
		double TAP,TAP1,TAP2;
		double DIS1 = 0.1;
		double DIS2 = 0.2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Start Date (1-31): ");
		SD =input.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
		ED =input.nextInt();
		
		NDR = ED - SD;
		
			if(SD<1||ED>31)
			{
				
			System.out.println(" ");
			System.out.println("Error: Days must be between 1 and 31");
		
			}
		
			else if(SD>=ED)
			{
			
			System.out.println(" ");
			System.out.println("Error: Start Date must be less than End Date");
		
			}
			
			else if (SD>=1 && ED<=31)
			{
		
				System.out.println(" ");
				System.out.println("Room Charge Per Day:Rs. " + RCPD + "/=");
			
				NDR = ED - SD;
				TAP = RCPD * NDR;
			
			
				System.out.println("Number of Days Reserved: " +NDR );			
							
				
			
						if(NDR<3)
						{
				
						System.out.println("Total Amount to be Paid: " +TAP );
				
						}
			
						else if(NDR == 3 || NDR == 4)
						{
			
						TAP1 = ( TAP - ( TAP * DIS1));
						System.out.println("Total Amount to be Paid: " +TAP1 );
			
						}
				
						else
						{
			
						TAP2 = ( TAP - ( TAP * DIS2));
						System.out.println("Total Amount to be Paid: " +TAP2 );
				
						}
					
				
			}	
		
	
	
	}

}