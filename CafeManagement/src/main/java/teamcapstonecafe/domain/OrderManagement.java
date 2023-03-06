package teamcapstonecafe.domain;

import teamcapstonecafe.domain.CookStarted;
import teamcapstonecafe.domain.PointAssigned;
import teamcapstonecafe.CafeManagementApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="OrderManagement_table")
@Data

public class OrderManagement  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String productId;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){


        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();



        PointAssigned pointAssigned = new PointAssigned(this);
        pointAssigned.publishAfterCommit();

    }

    public static OrderManagementRepository repository(){
        OrderManagementRepository orderManagementRepository = CafeManagementApplication.applicationContext.getBean(OrderManagementRepository.class);
        return orderManagementRepository;
    }



    public void orderConfirmed(OrderConfirmedCommand orderConfirmedCommand){
    }

    public static void orderReceived(PaymentApproved paymentApproved){

        /** Example 1:  new item 
        OrderManagement orderManagement = new OrderManagement();
        repository().save(orderManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentApproved.get???()).ifPresent(orderManagement->{
            
            orderManagement // do something
            repository().save(orderManagement);


         });
        */

        
    }


}
