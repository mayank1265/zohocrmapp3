package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Contact;

public interface ContactService {
  
	public void saveContact(Contact contact); // to save we give (Contact)entity class

	public List<Contact> getAllContacts();

	public Contact getContactById(long id);
}
