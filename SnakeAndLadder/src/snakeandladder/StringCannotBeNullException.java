package exceptiontest;

import java.util.Scanner;

public class StringCannotBeNullException extends Exception 
{
	public StringCannotBeNullException() 
	{
		System.out.println("User name cannot be null");
	}
	
	public static String enterAValidName()
	{
		Scanner sc = new Scanner(System.in);
		
		//StringCannotBeNullException se = new StringCannotBeNullException();
		
		System.out.println("Enter a valid username");
		String playerName = sc.nextLine();
		try 
		{
			if(playerName.isEmpty() || playerName.equals(null))
			{
				throw new StringCannotBeNullException();
			}
			else
			{
				return playerName;
			}
		}catch (StringCannotBeNullException e) {
			playerName = e.enterAValidName();
		}
		
		return playerName;
	}
}
