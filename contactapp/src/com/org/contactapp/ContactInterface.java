package com.org.contactapp;

import java.util.ArrayList;
import java.util.List;

public interface ContactInterface 
{
	void addContact();
	void viewContact();
	void viewAllContact();
	void updateContact();
	void deleteContact();
	void deleteAllContact();
	
	List<Contact>ContactList = new ArrayList<Contact>();
}
