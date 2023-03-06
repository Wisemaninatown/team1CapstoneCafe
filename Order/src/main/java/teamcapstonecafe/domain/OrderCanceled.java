package teamcapstonecafe.domain;

import teamcapstonecafe.domain.*;
import teamcapstonecafe.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private Integer customerId;
    private Float amount;
    private String status;

    public OrderCanceled(Order aggregate){
        super(aggregate);
    }
    public OrderCanceled(){
        super();
    }
}
