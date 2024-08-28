import java.util.Scanner;

public class IT24100710Lab5Q1
{
	public static void main(String[]arg)
	{
		int N1 , N2 , N3;
		int Min , Max ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		N1 =input.nextInt();
		
		System.out.print("Enter the second integer: ");
		N2 =input.nextInt();
		
		System.out.print("Enter the third integer: ");
		N3 =input.nextInt();
		
		
		System.out.println(" ");
		System.out.println("User entered numbers are : " + N1 + " " + N2 + " " + N3);
	
			if(N1<N2)
			{
				if(N1<N3)
				{
				
				System.out.println("The Smallest number is: " +N1);
				
				}
				else
				{
				
				System.out.println("The Smallest number is: " +N3);
				
				}
			
			
			}
			else
			{
				if(N2<N3)
				{
				
				System.out.println("The Smallest number is: " +N2);
				
				}

				else
				{

				System.out.println("The Largest number is: " +N3);

				}
			
			
			}
			
			if(N1>N2)
			{
				if(N1>N3)
				{
				
				System.out.println("The Largest number is: " +N1);
				
				}
				else
				{
				
				System.out.println("The Largest number is: " +N3);
				
				}
			
			
			}
			else
			{
				if(N2>N3)
				{
				
				System.out.println("The Largest number is: " +N2);
				
				}
				
				else
				{

				System.out.println("The Largest number is: " +N3);

				}
			
			
			}
		
	}

}