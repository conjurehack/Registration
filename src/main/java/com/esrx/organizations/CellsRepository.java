package com.esrx.organizations;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:9000")
@RepositoryRestResource(collectionResourceRel="cells", path="cells")
public interface CellsRepository extends MongoRepository<Cells, String> {

	List<Cells> findByshelterIdAndDate(@Param("shelterId") String shelterId,@Param("date") String date );
	//List<Shelters> findByuuid(@Param("uuid") String uuid);
	
	
}
