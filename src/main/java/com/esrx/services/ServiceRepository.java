package com.esrx.services;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="serviceTypes", path="serviceTypes")
public interface ServiceRepository extends MongoRepository<ServiceTypes, String> {

}
