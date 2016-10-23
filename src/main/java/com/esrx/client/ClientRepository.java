package com.esrx.client;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="clients", path="clients")
public interface ClientRepository extends MongoRepository<Client, String> {

	List<Client> findBylastName(@Param("name") String name);
	
	
}
