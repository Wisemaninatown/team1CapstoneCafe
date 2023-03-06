package teamcapstonecafe.domain;

import teamcapstonecafe.domain.*;
import teamcapstonecafe.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private String status;

    public CookStarted(OrderManagement aggregate){
        super(aggregate);
    }
    public CookStarted(){
        super();
    }
}
