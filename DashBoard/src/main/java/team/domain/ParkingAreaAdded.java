package team.domain;

import team.infra.AbstractEvent;
import lombok.Data;
import java.util.Date;

@Data
public class ParkingAreaAdded extends AbstractEvent {

    private Long id;
    private String status;
    private String parkingZoneNo;
    private Long parkingId;
}
