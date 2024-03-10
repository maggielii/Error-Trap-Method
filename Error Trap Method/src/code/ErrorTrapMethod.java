package code;

import java.util.Scanner;

public class ErrorTrapMethod {

	public static int input(int min, int max)
	{	
		Scanner input = new Scanner(System.in);
		
		if(min > max)
		{
			int temp = min;
			min = max;
			max = temp; 
		}

		int number = min-1; 
		
		do 
		{
			try 
			{
				System.out.print("Enter a number from " + min + " to " + max + ": ");	
				number = input.nextInt();
			}
			catch(Exception e)
			{
				System.out.println("Invalid input");
				input.next();
			}
			
		}while(number > max || number < min);
		
		return number;
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println( input(1,10) ); 

	}

}
