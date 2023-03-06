package teamcapstonecafe.domain;

import teamcapstonecafe.domain.*;
import teamcapstonecafe.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private String status;
}


