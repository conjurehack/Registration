package com.esrx.volunteer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="volunteers", path="volunteers")
public interface VolunteerRepository extends MongoRepository<Volunteer, String> {

}
