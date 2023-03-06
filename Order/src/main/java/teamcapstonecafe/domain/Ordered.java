package teamcapstonecafe.domain;

import teamcapstonecafe.domain.*;
import teamcapstonecafe.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private String productdId;
    private Integer qty;
    private String customerId;
    private Float amount;
    private String status;
    private String productId;
    private String pickupTime;

    public Ordered(Order aggregate){
        super(aggregate);
    }
    public Ordered(){
        super();
    }
}
