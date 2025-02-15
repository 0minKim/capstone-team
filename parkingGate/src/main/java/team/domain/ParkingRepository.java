package team.domain;

import team.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="parkings", path="parkings")
public interface ParkingRepository extends PagingAndSortingRepository<Parking, Long>{


}
