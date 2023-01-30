package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contact;
import com.zohocrm.repositories.ContactRepository;

@Service // stereotype annotation
public class ContactServiceImpl implements ContactService {
   
	@Autowired // to save the contact 
	ContactRepository contactRepo;
	
	@Override
	public void saveContact(Contact contact) {
       contactRepo.save(contact); // saved 
	}

	@Override
	public List<Contact> getAllContacts() {
        List<Contact> coontacts = contactRepo.findAll();
		return coontacts;
	}

	@Override
	public Contact getContactById(long id) {
              Optional<Contact> findById = contactRepo.findById(id); // this method is came from repository
              Contact contact = findById.get(); //convert FindBy to Entity object
              return contact; // return entity object and this object will pass to billing controller
	}

}
