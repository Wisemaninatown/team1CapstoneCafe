package teamcapstonecafe.domain;

import teamcapstonecafe.domain.Ordered;
import teamcapstonecafe.domain.OrderCanceled;
import teamcapstonecafe.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String productId;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private Float amount;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String pickupTime;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        teamcapstonecafe.external.PaymentCommand paymentCommand = new teamcapstonecafe.external.PaymentCommand();
        // mappings goes here
        OrderApplication.applicationContext.getBean(teamcapstonecafe.external.PayService.class)
            .payment(/* get???(), */ paymentCommand);



        Ordered ordered = new Ordered(this);
        ordered.publishAfterCommit();



        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }




    public static void orderStatusChanged(CookStarted cookStarted){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookStarted.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }


}
