package com.esrx.services;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="shelteramentities", path="shelteramentities")
public interface ShelterAmentitiesRepository extends MongoRepository<ShelterAmentities, String> {

}
