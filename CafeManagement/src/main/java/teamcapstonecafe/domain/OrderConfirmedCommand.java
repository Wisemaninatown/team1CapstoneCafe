package teamcapstonecafe.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Data
public class OrderConfirmedCommand {

        private String productId;
        private Integer qty;
        private Integer customerId;
        private String status;


}
