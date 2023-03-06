package teamcapstonecafe.domain;

import teamcapstonecafe.domain.*;
import teamcapstonecafe.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class PointAssigned extends AbstractEvent {

    private Long id;
    private String customerId;
    private Integer point;
    private String productId;
    private Integer qty;
    private String status;

    public PointAssigned(OrderManagement aggregate){
        super(aggregate);
    }
    public PointAssigned(){
        super();
    }
}
