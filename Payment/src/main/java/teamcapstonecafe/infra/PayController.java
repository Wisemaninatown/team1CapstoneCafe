package teamcapstonecafe.infra;
import teamcapstonecafe.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;


@RestController
// @RequestMapping(value="/pays")
@Transactional
public class PayController {
    @Autowired
    PayRepository payRepository;



    @RequestMapping(value = "pays/{id}/payment",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Pay payment(@PathVariable(value = "id") Long id, @RequestBody PaymentCommand paymentCommand, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /pay/payment  called #####");
            Optional<Pay> optionalPay = payRepository.findById(id);
            
            optionalPay.orElseThrow(()-> new Exception("No Entity Found"));
            Pay pay = optionalPay.get();
            pay.payment(paymentCommand);
            
            payRepository.save(pay);
            return pay;
            
    }
    



}
