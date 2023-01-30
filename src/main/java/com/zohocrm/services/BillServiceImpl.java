package com.zohocrm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billing;
import com.zohocrm.repositories.BillRepository;
@Service
public class BillServiceImpl implements BillService {

	@Autowired
	BillRepository billRepo;
	
	
	@Override
	public void saveOneBill(Billing billing) {
    billRepo.save(billing);       
	}

}
