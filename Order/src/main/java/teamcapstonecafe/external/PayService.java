package teamcapstonecafe.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;


@FeignClient(name = "Payment", url = "${api.url.Payment}")
public interface PayService {
    @RequestMapping(method= RequestMethod.PUT, path="/pays/{id}/payment")
    public void payment(@PathVariable("id") Long id, @RequestBody PaymentCommand paymentCommand );
}
