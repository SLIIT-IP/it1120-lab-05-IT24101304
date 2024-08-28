import java.util.Scanner;

public class IT24100710Lab5Q2
{
	public static void main(String[]arg)
	{
		int Member;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of new member introduced: ");
		Member = input.nextInt();
		
		System.out.println(" ");
		if (Member>=0)
		{
			if(Member<5)
			{
		
				switch(Member)
		
				{
					case 0 : System.out.print("No Prize");
							break;
				
					case 1 : System.out.print("Price is a : Pen");
							break;
						 
					case 2 : System.out.print("Price is a : Umberella");
							break;
				
					case 3 : System.out.print("Price is a : Bag");
							break;
				
					case 4 : System.out.print("Price is a : Travelling Chair");
							break;
				}
		
			}	
			
			else

			{
				System.out.print("Price is a : Headphone");
			
			}
		}				
		
		else
		
		{
			System.out.print("Input must be a number 0 or greater");

		}
		
		
		System.out.println(" ");
		
	}

}