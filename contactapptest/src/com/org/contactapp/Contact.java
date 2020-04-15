package com.org.contactapp;

import java.util.Scanner;

public class Contact implements ContactInterface
{
	String name;
	String phoneNumber;
	String eMail;
	String designation;
	String organisationName;
	
	public Contact()
	{
		
	}
	
	public Contact(String name, String phoneNumber) 
	{	
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	/*
	public Contact(String name, String phoneNumber, String eMail) 
	{
		this(name,phoneNumber);
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
	}
	
	public Contact(String name, String phoneNumber, String eMail,String designation) 
	{
		this(name,phoneNumber,eMail);
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
		this.designation = designation;
	}*/
	
	public Contact(String name, String phoneNumber, String eMail,String designation,String organisationName) 
	{
		this(name,phoneNumber);
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
		this.designation = designation;
		this.organisationName = organisationName;
	}
	
	
	public String phoneNumberValidation(String phoneNumber)
	{
		try {
			
			if(phoneNumber.length() != 10)
			{
				throw new MyException();
			}
		}
		catch (MyException e) {
			phoneNumber = e.enterAValidPhoneNo();
		}
		
		return phoneNumber;
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
			String phoneNumber = s.next();
			
			phoneNumber = phoneNumberValidation(phoneNumber);
			
			Contact con;
			
			con = new Contact(name, phoneNumber);
			
			ContactInterface.ContactList.add(con);
		}
		else if(contactType == 2)
		{
			System.out.println("Enter your contact name :");
			String name = s.next();
			
			System.out.println("Enter your Phone Number :");
			String phoneNumber = s.next();
			
			phoneNumber = phoneNumberValidation(phoneNumber);
			
			System.out.println("Enter your email id :");
			String eMail = s.next();
			
			System.out.println("Enter your designation :");
			String designation = s.next();
			
			System.out.println("Enter your organisation name :");
			String organisationName = s.next();
			
			Contact con;
			
			con = new Contact(name, phoneNumber, eMail, designation, organisationName);
			
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
		
		if(ContactInterface.ContactList.isEmpty())
		{
			System.out.println("There are no contacts to view");
		}
		else
		{
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
					 try {
						 if(!(ContactInterface.ContactList.get(index).eMail.isEmpty()))
						 {
							 System.out.println("E-Mail: "+ContactInterface.ContactList.get(index).eMail); 
						 } 
					 }catch (Exception e) {
						//System.out.println();
						 //return;
						 try {
							 if(!(ContactInterface.ContactList.get(index).designation.isEmpty()))
							 {
								 System.out.println("Designation: "+ContactInterface.ContactList.get(index).designation);
							 } 
						 }catch (Exception e1) {
							 try {
								 if(!(ContactInterface.ContactList.get(index).organisationName.isEmpty()))
								 {
									 System.out.println("Organisation name: "+ContactInterface.ContactList.get(index).organisationName); 
								 }
							 }catch (Exception e2) {
								 System.out.println();;
							}
							 
						}
					}
					 
					 
						
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
		}
		
		//int index = ContactList.indexOf(name);
		 //int index = ContactList.indexOf(name);
		
	}
	public void viewAllContact()
	{
		if(ContactInterface.ContactList.isEmpty())
		{
			System.out.println("There are no contacts to view");
		}
		else
		{
			System.out.println("\n\nThe contacts in your contactlist is:");
			for (Contact x : ContactList) 
			{
				System.out.println("Contact Name: "+x.name);
				System.out.println("Phone number: "+x.phoneNumber);
				
				try {
					if(!(x.eMail.isEmpty()))
					System.out.println("Email Id: "+x.eMail);
				}catch (Exception e) {
					try {
						if(!(x.designation.isEmpty()))
							System.out.println("Email Id: "+x.designation);
					} catch (Exception e2) {
						try {
							if(!(x.organisationName.isEmpty()))
								System.out.println("Email Id: "+x.organisationName);
						} catch (Exception e3) {
							System.out.println("\n");
						}
					}
				}
				
				System.out.println("\n");
			}
			System.out.println("\n");
		}
		
	}
	
	public void updateContact()
	{
		
		int index = -1;
		int choice = 0;
		int count = 0;
		int choose = 0;
		Scanner s = new Scanner(System.in);
		//int index = -1;
		//Contact newCon;
		if(ContactInterface.ContactList.isEmpty())
		{
			System.out.println("There are no contacts to update");
		}
		else
		{
			System.out.println("\n\nEnter Existing Contact Name: ");
			String existingName = s.nextLine();
			
			//Contact existContact = ContactList.
					
				/*int index = -1;
				int choice = 0;
				int count = 0;
				int choose = 0;*/
			
			for(int i = 0;i < ContactList.size();i++)
			{
				Contact existingContact = ContactInterface.ContactList.get(i);
				
				if(existingContact.name.equals(existingName))
				{
					 index = i;
					 count++;
					 
					 System.out.println("\n");
					 System.out.println("Contact Name: "+ContactInterface.ContactList.get(index).name);
					 System.out.println("Phone Number: "+ContactInterface.ContactList.get(index).phoneNumber);
					 try {
						 if(!(ContactInterface.ContactList.get(index).eMail.isEmpty()))
						 {
							 System.out.println("E-Mail: "+ContactInterface.ContactList.get(index).eMail); 
						 } 
					 }catch (Exception e) {
						//System.out.println();
						 //return;
						 try {
							 if(!(ContactInterface.ContactList.get(index).designation.isEmpty()))
							 {
								 System.out.println("Designation: "+ContactInterface.ContactList.get(index).designation);
							 } 
						 }catch (Exception e1) {
							 try {
								 if(!(ContactInterface.ContactList.get(index).organisationName.isEmpty()))
								 {
									 System.out.println("Organisation name: "+ContactInterface.ContactList.get(index).organisationName); 
								 }
							 }catch (Exception e2) {
								 System.out.println();;
							}
							 
						}
					}
					
				}
			}
			
			int option = 0;
			int counter = 0;
			
			//System.out.println("There are "+count+" contacts with the same name.Hence specify the contact that you want to update");
			 //choose = s.nextInt();
			 Contact newCon;
			 
			 if(count > 1)
			 {
				 System.out.println("There are "+count+" contacts with the same name.Hence specify the contact that you want to update");
				 choose = s.nextInt(); 
			 }
			// System.out.println("There are "+count+" contacts with the same name.Hence specify the contact that you want to update");
			 //choose = s.nextInt();
			 
				System.out.println(count);
				for(int i = 0;i < ContactList.size();i++)
				{
					Contact existingContact = ContactInterface.ContactList.get(i);
					//Contact newCon;
					if(existingContact.name.equals(existingName))
					{
						//System.out.println("ssssssssssssssssssss");
						counter++;
						 if(count > 1)
						 { 
							 //System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
							 if(counter == choose)
							 {
								 System.out.println("\nChoose whether you are going to enter personal contact or professional contact");
									System.out.println("Choose 1 for Personal Contact 2 for Professional contact");
									index = i;
									choice = s.nextInt();
								 if(choice == 1)
									{
									 //newCon;
									 //index = i;
									 System.out.println("Enter the field that you want to update");
									 System.out.println("1,update name 2,update phone no");
									 option = s.nextInt();
									 String newName = "";
									 String newNumber= "";
									 switch(option)
									 {
									 case 1:
										 System.out.println("Enter new contact name: ");
										 newName = s.next();
										 //Contact newCon;
										 newCon = new Contact(newName,existingContact.phoneNumber);
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
										 break;
										 
									 case 2:
										 System.out.println("Enter new phone number: ");
										 newNumber = s.next();
										 newNumber = phoneNumberValidation(newNumber);
										 //Contact newCon;
										 newCon = new Contact(existingContact.name,newNumber);
										 pos = index;
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
										 break;
									 }
										
										
									}
								else if(choice == 2)
									{
										System.out.println("Enter the field that you want to update");
										System.out.println("1,update name 2,update phone no 3,Update email id 4,Update designation 5,Update Organisation name");
										option = s.nextInt();
										
										 String newProName = "";
										 String newProNumber= "";
										 String newMail = "";
										 String newDesignation = "";
										 String newOrganisationName = "";
										 
										 switch(option)
										 {
										 case 1:
											 System.out.println("Enter new contact name: ");
											 newProName = s.next();
											 newCon = new Contact(newProName,existingContact.phoneNumber,existingContact.eMail,existingContact.designation,existingContact.organisationName);
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
											 break;
											 
										 case 2:
											 System.out.println("Enter new phone number: ");
											 newProNumber = s.next();
											 newProNumber = phoneNumberValidation(newProNumber);
											 newCon = new Contact(existingContact.name,newProNumber,existingContact.eMail,existingContact.designation,existingContact.organisationName);
											 pos = index;
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
											 break;
											 
										 case 3:
											 System.out.println("Enter your email id :");
											 newMail = s.next();
											 newCon = new Contact(existingContact.name,existingContact.phoneNumber,newMail,existingContact.designation,existingContact.organisationName);
											 pos = index;
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
											 break;
											 
										 case 4:
											 System.out.println("Enter your designation :");
											 newDesignation = s.next();
											 newCon = new Contact(existingContact.name,existingContact.phoneNumber,existingContact.eMail,newDesignation,existingContact.organisationName);
											 pos = index;
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
											 break;
										 
										 case 5:		
											 System.out.println("Enter your organisation name :");
											 newOrganisationName = s.next();
											 newCon = new Contact(existingContact.name,existingContact.phoneNumber,existingContact.eMail,existingContact.designation,newOrganisationName);
											 pos = index;
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
											 break;
										 }
										
										
									}
									else
									{
										System.out.println("Invalid choice entered");
										return;
									}
							 }
							 
						 }
						 else if(count == 1 && choose == 0)
						 {
							 //if(count == choose)
							 //{
							 
							 System.out.println("\nChoose whether you are going to enter personal contact or professional contact");
								System.out.println("Choose 1 for Personal Contact 2 for Professional contact");
								
								choice = s.nextInt();
							 if(choice == 1)
							 {
								 
								 System.out.println("Enter the field that you want to update");
								 System.out.println("1,update name 2,update phone no");
								 option = s.nextInt();
								 String newName = "";
								 String newNumber= "";
								 switch(option)
								 {
								 case 1:
									 System.out.println("Enter new contact name: ");
									 newName = s.next();
									 //Contact newCon;
									 newCon = new Contact(newName,existingContact.phoneNumber);
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
									 break;
									 
								 case 2:
									 System.out.println("Enter new phone number: ");
									 newNumber = s.next();
									 newNumber = phoneNumberValidation(newNumber);
									 //Contact newCon;
									 newCon = new Contact(existingContact.name,newNumber);
									 pos = index;
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
									 break;
								 }
									
						      }
							 else if(choice == 2)
							 {
									System.out.println("Enter the field that you want to update");
									System.out.println("1,update name 2,update phone no 3,Update email id 4,Update designation 5,Update Organisation name");
									option = s.nextInt();
									
									 String newProName = "";
									 String newProNumber= "";
									 String newMail = "";
									 String newDesignation = "";
									 String newOrganisationName = "";
									 
									 switch(option)
									 {
									 case 1:
										 System.out.println("Enter new contact name: ");
										 newProName = s.next();
										 newCon = new Contact(newProName,existingContact.phoneNumber,existingContact.eMail,existingContact.designation,existingContact.organisationName);
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
										 break;
										 
									 case 2:
										 System.out.println("Enter new phone number: ");
										 newProNumber = s.next();
										 newProNumber = phoneNumberValidation(newProNumber);
										 newCon = new Contact(existingContact.name,newProNumber,existingContact.eMail,existingContact.designation,existingContact.organisationName);
										 pos = index;
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
										 break;
										 
									 case 3:
										 System.out.println("Enter your email id :");
										 newMail = s.next();
										 newCon = new Contact(existingContact.name,existingContact.phoneNumber,newMail,existingContact.designation,existingContact.organisationName);
										 pos = index;
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
										 break;
										 
									 case 4:
										 System.out.println("Enter your designation :");
										 newDesignation = s.next();
										 newCon = new Contact(existingContact.name,existingContact.phoneNumber,existingContact.eMail,newDesignation,existingContact.organisationName);
										 pos = index;
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
										 break;
									 
									 case 5:		
										 System.out.println("Enter your organisation name :");
										 newOrganisationName = s.next();
										 newCon = new Contact(existingContact.name,existingContact.phoneNumber,existingContact.eMail,existingContact.designation,newOrganisationName);
										 pos = index;
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
										 break;
									 }
									
									
								}
								else
								{
									System.out.println("Invalid choice entered");
									return;
								}
							 }	 
						 }
					
				}
				/*if(index == -1)
				{
					System.out.println("No such contact exist");
					return;
				}
				else
				{
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
			/*if(index == -1)
			{
				System.out.println("No such contact exist");
				return;
			}
			else
			{
				return;
			}*/
		
		

	
	public void deleteContact()
	{
		Scanner s = new Scanner(System.in);
		if(ContactInterface.ContactList.isEmpty())
		{
			System.out.println("There are no contacts to delete");
		}
		else
		{
			System.out.println("\nEnter the existing name that you want to delete: ");
			String existingName = s.nextLine();
			
			int index = -1;
			int count = 0;
			int choice = 0;
			
			for(int i = 0;i < ContactList.size();i++)
			{
				Contact existingContacts = ContactInterface.ContactList.get(i);
				
				if(existingContacts.name.equals(existingName))
				{
					count++;
					 index = i;
					 
					 System.out.println("\n");
					 System.out.println("Contact Name: "+ContactInterface.ContactList.get(index).name);
					 System.out.println("Phone Number: "+ContactInterface.ContactList.get(index).phoneNumber);
					 try {
						 if(!(ContactInterface.ContactList.get(index).eMail.isEmpty()))
						 {
							 System.out.println("E-Mail: "+ContactInterface.ContactList.get(index).eMail); 
						 } 
					 }catch (Exception e) {
						//System.out.println();
						 //return;
						 try {
							 if(!(ContactInterface.ContactList.get(index).designation.isEmpty()))
							 {
								 System.out.println("Designation: "+ContactInterface.ContactList.get(index).designation);
							 } 
						 }catch (Exception e1) {
							 try {
								 if(!(ContactInterface.ContactList.get(index).organisationName.isEmpty()))
								 {
									 System.out.println("Organisation name: "+ContactInterface.ContactList.get(index).organisationName); 
								 }
							 }catch (Exception e2) {
								 System.out.println();
							}
							 
						}
					}
					 //return;
				}
				/*else
				{
					System.out.println("No such contact exist");
					return;
				}*/
			}
			int counter = 0;
			
			if(count > 1)
			 {
				 System.out.println("There are "+count+" contacts with the same name.Hence specify the contact that you want to update");
				 choice = s.nextInt(); 
			 }
			
			for(int i = 0;i < ContactList.size();i++)
			{
				Contact existingContacts = ContactInterface.ContactList.get(i);
				
				if(existingContacts.name.equals(existingName))
				{
					 if(count > 1)
					 {
						 index = i;
						 counter++;
						 //System.out.println("There are "+count+" contacts with the same name.Hence specify the contact that you want to delete");
						 //choice = s.nextInt();
						 
						 if(counter == choice)
						 {
							 ContactInterface.ContactList.remove(index);
							 System.out.println("Contact removed successfully");
						 }
					 }
					 else if(count == 1 && choice == 0)
					 {
						 ContactInterface.ContactList.remove(index);
						 System.out.println("Contact removed successfully");
					 }
					 
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
		}
		
	}
	
	public void deleteAllContact()
	{
		ContactInterface.ContactList.removeAll(ContactInterface.ContactList);
		System.out.println("All contacts removed successfully");
		
		return;
	}
}






/*
if(choice == 1)
{
	System.out.println("Enter new contact name: ");
	String newName = s.next();
	
	System.out.println("Enter new phone number");
	String newNumber = s.next();
	
	newNumber = phoneNumberValidation(newNumber);
	
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
	String newProNumber = s.next();
	
	newProNumber = phoneNumberValidation(newProNumber);
	
	System.out.println("Enter your email id :");
	String newMail = s.next();
	
	System.out.println("Enter your designation :");
	String newDesignation = s.next();
	
	System.out.println("Enter your organisation name :");
	String newOrganisationName = s.next();
	
	Contact newCon;
	newCon = new Contact(newProName,newProNumber,newMail,newDesignation,newOrganisationName);
	
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
*/