package com.esrx.donor;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="donors", path="donors")
public interface DonorRepository extends MongoRepository<Donor, String> {
	List<Donor> findBylastname(@Param("name") String name);
}
