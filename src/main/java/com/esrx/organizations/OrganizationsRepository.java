package com.esrx.organizations;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/rest")
@CrossOrigin(origins = "http://localhost:9000")
@RepositoryRestResource(collectionResourceRel="shelters", path="shelters")
public interface OrganizationsRepository extends MongoRepository<Organizations, String> {

	List<Organizations> findByzipCode(@Param("zipCode") String zipCode);
	
	
}
