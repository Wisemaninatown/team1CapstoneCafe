package teamcapstonecafe.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Data
public class PaymentCommand {

        private String customerId;
        private Float amount;
        private String status;


}
