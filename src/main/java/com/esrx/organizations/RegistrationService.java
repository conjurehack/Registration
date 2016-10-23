package com.esrx.organizations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:9000")
public class RegistrationService {
	
	//todo
//	private String data = "10-20-2016";
	
	@Autowired
	private CellsRepository cellsRepository;
	
	@Autowired
	private SheltersRepository sheltersRepository;
	
	 @RequestMapping("/shelterslist/{uuid}/{date}")
	public Shelters getShelters(@PathVariable("uuid") String uuid, @PathVariable("date") String data) {
		Shelters shelters = sheltersRepository.findOne(uuid);
		//for (Shelters shelter : shelters) {
			String capa=shelters.getTotalBeds();
			List<Cells> cells =  cellsRepository.findByshelterIdAndDate(shelters.getUuid(), data);
			if (cells.isEmpty()) {
				System.out.println("cells are empty" );
				for (int i =0; i <Integer.parseInt(capa); i++) {
					Cells cell = new Cells();
					cell.setShelterId(shelters.getUuid());
					cell.setDate(data);
					cells.add(cell);
				}
				cellsRepository.save(cells);
				
			}
			
			shelters.setCells(cells);
			
			//System.out.println(shelter.getShelterId());
			System.out.println(cells);
			
//		}
		return shelters;
	}
	
	

}
