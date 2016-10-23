package com.esrx.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:9000")
public class ClientService {
	
	//todo
//	private String data = "10-20-2016";
	
	@Autowired
	private ClientRepository clientRepository;
	
	
	
	 @RequestMapping("/clientlist/{lastName}")
	public List<Client> getClients( @PathVariable("lastName") String lastName) {
		List<Client> clients = clientRepository.findBylastName(lastName);
		return clients;
	}
	
	

}
