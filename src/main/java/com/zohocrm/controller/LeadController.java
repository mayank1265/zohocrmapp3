
package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.services.ContactService;
import com.zohocrm.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired //
	private LeadService leadService; // service layer get back to controller layer
  
	@Autowired
	private ContactService contactService; 
	
	@GetMapping("/viewLeadPage")
	public String viewCreateLeadPage() {
		
		return "create_new_lead"; // get back to front end
	}
	@PostMapping("/save")
	public String saveLead(@ModelAttribute("lead") Lead lead, Model model) {
	    
		leadService.saveOneLead(lead); // get from service layer 
		model.addAttribute("lead", lead);
		return "lead_info"; // display lead info in this page
	}
	@PostMapping("/convertLead")  // Developing convert button
   public String convertLead(@RequestParam("id") long id, Model model){ // let us take the lead detail 
		Lead lead = leadService.findLeadById(id); // step 1 -supply the id & get the lead object
		
		Contact contact = new Contact();// step 2-take the content from lead and put into entity(Contact)
		contact.setFirstName(lead.getFirstName());// taking from lead and initializing contact by set
	    contact.setLastName(lead.getLastName());
	    contact.setEmail(lead.getEmail());
	    contact.setMobile(lead.getMobile());
	    contact.setSource(lead.getSource());
		
	    contactService.saveContact(contact); // saving the contact from lead
	    
	    leadService.deleteLeadById(id); // step 3- delete from lead
	    List<Contact> contacts = contactService.getAllContacts(); // leads return here 
		 model.addAttribute("contacts", contacts);
		 return "list_contacts";
	}
     @RequestMapping("/listall")
	 public String listAllLeads(Model model) {
	 List<Lead> leads = leadService.getAllLeads(); // leads return here 
	 model.addAttribute("leads", leads);
	 return "list_leads"; // this is the page where we have to develop the content using JSTL
  }
     @RequestMapping("/leadInfo")
     public String leadInfo(@RequestParam("id") long id, Model model) {
	 Lead lead = leadService.findLeadById(id);
	 model.addAttribute("lead" ,lead); // blue lead string
	 return "lead_info"; // page where we developed name link
 }
}
