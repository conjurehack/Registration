package com.esrx.organizations;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:9000")
@RepositoryRestResource(collectionResourceRel="shelters", path="shelters")
public interface SheltersRepository extends MongoRepository<Shelters, String> {

	List<Shelters> findByzipCode(@Param("zipCode") String zipCode);
	List<Shelters> findByuuid(@Param("uuid") String uuid);
	
	
}
