package com.org.contactapp;

import java.util.Scanner;

public class Contact implements ContactInterface
{
	String name;
	long phoneNumber;
	String eMail;
	String designation;
	String organisationName;
	String organAddress;
	
	public Contact()
	{
		
	}
	
	public Contact(String name, long phoneNumber) 
	{	
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public Contact(String name, long phoneNumber, String eMail,String designation,String organisationName,String organAddress) 
	{
		this(name,phoneNumber);
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
		this.designation = designation;
		this.organisationName = organisationName;
		this.organAddress = organAddress;
	}
	
	
	
	public void addContact()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("\n\nPress 1 to enter \nPersonal contact \nPress 2 to enter \nProfessional Contact");
		int contactType = s.nextInt();
		
		if(contactType == 1)
		{
			System.out.println("Enter your contact name :");
			String name = s.next();
			
			System.out.println("Enter your Phone Number :");
			long phoneNumber = s.nextLong();
			
			Contact con;
			
			con = new Contact(name, phoneNumber);
			
			ContactInterface.ContactList.add(con);
		}
		else if(contactType == 2)
		{
			System.out.println("Enter your contact name :");
			String name = s.next();
			
			System.out.println("Enter your Phone Number :");
			long phoneNumber = s.nextLong();
			
			System.out.println("Enter your email id :");
			String eMail = s.next();
			
			System.out.println("Enter your designation :");
			String designation = s.next();
			
			System.out.println("Enter your organisation name :");
			String organisationName = s.next();
			
			System.out.println("Enter your organisation address :");
			String organAddress = s.next();
			
			Contact con;
			
			con = new Contact(name, phoneNumber, eMail, designation, organisationName, organAddress);
			
			ContactInterface.ContactList.add(con);
		}
		else
		{
			System.out.println("Sorry You have entered a invalid number");
			return;
		}
	}
	
	public void viewContact()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter the name that you want to find: ");
		String existingName = s.nextLine();
		
		int index = -1;
		
		for(int i = 0;i < ContactInterface.ContactList.size();i++)
		{
			Contact contacts = ContactInterface.ContactList.get(i);
			
			if(contacts.name.equals(existingName))
			{
				 index = i;
				 
				 System.out.println("\n");
				 System.out.println("Contact Name: "+ContactInterface.ContactList.get(index).name);
				 System.out.println("Phone Number: "+ContactInterface.ContactList.get(index).phoneNumber);
				 System.out.println("E-Mail: "+ContactInterface.ContactList.get(index).eMail);
				 System.out.println("Designation: "+ContactInterface.ContactList.get(index).designation);
				 System.out.println("Organisation name: "+ContactInterface.ContactList.get(index).organisationName);
				 System.out.println("Organisation address: "+ContactInterface.ContactList.get(index).organAddress);
					
				 System.out.println("\n\n");
				 //return;
			}
		}
		
		if(index == -1)
		{
			System.out.println("No such contact exist");
			return;
		}
		else
		{
			return;
		}
		//int index = ContactList.indexOf(name);
		 //int index = ContactList.indexOf(name);
		
	}
	public void viewAllContact()
	{
		System.out.println("\n\nThe contacts in your contactlist is:");
		for (Contact x : ContactList) 
		{
			System.out.println("Contact Name: "+x.name);
			System.out.println("Phone number: "+x.phoneNumber);
			System.out.println("Email Id: "+x.eMail);
			System.out.println("Designation: "+x.designation);
			System.out.println("Organisation Namr: "+x.organisationName);
			System.out.println("Organisation Address: "+x.organAddress);
			
			System.out.println("\n");
		}
		System.out.println("\n");
	}
	
	public void updateContact()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("\n\nEnter Existing Contact Name: ");
		String existingName = s.nextLine();
		
		//Contact existContact = ContactList.
				
			int index = -1;
			int choice = 0;
			
			System.out.println("\nChoose whether you are going to enter personal contact or professional contact");
			System.out.println("Choose 1 for Personal Contact 2 for Professional contact");
			
			choice = s.nextInt();
		
		for(int i = 0;i < ContactList.size();i++)
		{
			Contact existingContact = ContactInterface.ContactList.get(i);
			
			if(existingContact.name.equals(existingName))
			{
				 index = i;
				if(choice == 1)
				{
					System.out.println("Enter new contact name: ");
					String newName = s.next();
					
					System.out.println("Enter new phone number");
					long newNumber = s.nextLong();
					
					Contact newCon;
					newCon = new Contact(newName,newNumber);
					
					//int pos = this.ContactList.indexOf(existingContact.name);
					int pos = index;
					if(pos < 0)
					{
						System.out.println(existingContact.name+" was not found");
						//return;
					}
					else
					{
						ContactInterface.ContactList.set(pos,newCon);
						System.out.println(existingContact.name+" was replaced by "+newCon.name);
						//return;
					}
				}
				else if(choice == 2)
				{
					System.out.println("Enter new contact name :");
					String newProName = s.next();
					
					System.out.println("Enter your Phone Number :");
					long newProNumber = s.nextLong();
					
					System.out.println("Enter your email id :");
					String newMail = s.next();
					
					System.out.println("Enter your designation :");
					String newDesignation = s.next();
					
					System.out.println("Enter your organisation name :");
					String newOrganisationName = s.next();
					
					System.out.println("Enter your organisation address :");
					String newOrganAddress = s.next();
					
					Contact newCon;
					newCon = new Contact(newProName,newProNumber,newMail,newDesignation,newOrganisationName,newOrganAddress);
					
					//int pos = this.ContactList.indexOf(existingContact.name);
					int pos = index;
					if(pos < 0)
					{
						System.out.println(existingContact.name+"was not found");
						//return;
					}
					else
					{
						ContactInterface.ContactList.set(pos,newCon);
						System.out.println(existingContact.name+" was replaced by "+newCon.name);
						//return;
					}
				}
				else
				{
					System.out.println("Invalid choice entered");
					return;
				}
			}
			/*else
			{
				System.out.println("Invalid choice entered");
				return;
			}*/
		}
		
		if(index == -1)
		{
			System.out.println("No such contact exist");
			return;
		}
		else
		{
			return;
		}
	}
	
	public void deleteContact()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter the existing name that you want to delete: ");
		String existingName = s.nextLine();
		
		int index = -1;
		
		for(int i = 0;i < ContactList.size();i++)
		{
			Contact existingContacts = ContactInterface.ContactList.get(i);
			
			if(existingContacts.name.equals(existingName))
			{
				 index = i;
				 
				 ContactInterface.ContactList.remove(index);
				 System.out.println("Contact removed successfully");
				 //return;
			}
			/*else
			{
				System.out.println("No such contact exist");
				return;
			}*/
		}
		
		if(index == -1)
		{
			System.out.println("No such contact exist");
			return;
		}
		else
		{
			return;
		}
	}
	
	public void deleteAllContact()
	{
		ContactInterface.ContactList.removeAll(ContactInterface.ContactList);
		System.out.println("All contacts removed successfully");
		
		return;
	}
}
