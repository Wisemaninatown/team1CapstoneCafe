package teamcapstonecafe.external;

import lombok.Data;
import java.util.Date;
@Data
public class Pay {

    private Long id;
    private Float amount;
    private String status;
    private String customerId;
}


