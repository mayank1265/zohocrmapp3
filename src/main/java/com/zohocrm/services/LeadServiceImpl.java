package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Lead;
import com.zohocrm.repositories.LeadRepository;

@Service  // 
 public class LeadServiceImpl implements LeadService {
    
	@Autowired // annotation
	private LeadRepository leadRepo;
	
	@Override 
	public void saveOneLead(Lead lead) {
       leadRepo.save(lead);
	}

	@Override
	public Lead findLeadById(long id) {
		Optional<Lead> findById = leadRepo.findById(id); // assign local variable optional
		 Lead lead = findById.get(); // convert find by id to local variable = lead
		return lead;
	}

	@Override
	public void deleteLeadById(long id) { // this is delete method 
		leadRepo.deleteById(id); //  // delete function
	}

	@Override
	public List<Lead> getAllLeads() {
       List<Lead> leads = leadRepo.findAll();
       
		return leads; // return 'leads' back to the controller layer 
	}

}