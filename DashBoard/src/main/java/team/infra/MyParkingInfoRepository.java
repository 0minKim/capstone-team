package team.infra;

import team.domain.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MyParkingInfoRepository extends CrudRepository<MyParkingInfo, Long> {


}