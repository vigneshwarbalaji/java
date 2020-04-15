package com.org.contactapp;

import java.util.Scanner;


public class MyException extends Exception 
{
	public MyException()
	{
		
	}
	
	public String enterAValidPhoneNo()
	{
		Scanner sc = new Scanner(System.in);
		
		//StringCannotBeNullException se = new StringCannotBeNullException();
		System.out.println("A phone number must be of length 10,hence");
		System.out.println("Enter a valid Phone Number");
		String phoneNumber = sc.nextLine();
		try 
		{
			if(phoneNumber.length() != 10)
			{
				throw new MyException();
			}
			else
			{
				return phoneNumber;
			}
		}catch (MyException e) {
			phoneNumber = e.enterAValidPhoneNo();
		}
		
		return phoneNumber;
	}
}
