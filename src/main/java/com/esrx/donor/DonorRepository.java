package com.esrx.donor;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="donors", path="donors")
public interface DonorRepository extends MongoRepository<Donor, String> {

}
