package com.org.contactapp;

import java.util.Scanner;

public class ContactMain 
{
	public static void main(String[] args) 
	{
		Contact list = new Contact();
		
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Press the following to perform the particular task:");
			System.out.println("1,Add Contact 2,View Contact 3,View All 4,Update 5,Delete Contact 6,Delete All 7,Quit");
			int choose = s.nextInt();
			
			switch(choose)
			{
			case 1 :
				list.addContact();
				break;
				
			case 2:
				list.viewContact();
				break;
			
			case 3:
				list.viewAllContact();
				break;
				
			case 4:
				list.updateContact();
				break;
				
			case 5:
				list.deleteContact();
				break;
				
			case 6:
				list.deleteAllContact();
				break;
				
			default :
				System.out.println("You choose to quit the application");
				
				System.exit(0);
			}
		}
	}
}
