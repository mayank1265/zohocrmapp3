package com.zohocrm.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.Contact;
import com.zohocrm.services.ContactService;

     @Controller
	public class ContactController {
    	 
    	 private ContactService contactService;
    	 
    	 
		 public ContactController(ContactService contactService) {
			
			this.contactService = contactService; //constructor based injection instead of auto 
		}


		@RequestMapping("/listallcontacts")
		 public String listAllLeads(Model model) {
		 List<Contact> contacts = contactService.getAllContacts(); // leads return here 
		 model.addAttribute("contacts", contacts);
		 return "list_contacts"; // this is the page where we have to develop the content using JSTL
  }
		

}
