package com.esrx.volunteer;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:9000")
@RepositoryRestResource(collectionResourceRel="volunteers", path="volunteers")
public interface VolunteerRepository extends MongoRepository<Volunteer, String> {

	List<Volunteer> findBylastName(@Param("name") String name);
	
}
