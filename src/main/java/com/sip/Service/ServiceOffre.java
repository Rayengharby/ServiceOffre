package com.sip.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.sip.Repository.OffreRepository;

public class ServiceOffre  implements CommandLineRunner {
	@Autowired 
	OffreRepository offreRepository;

	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
