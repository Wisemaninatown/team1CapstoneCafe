package teamcapstonecafe.domain;

import teamcapstonecafe.CustomerManagementApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="PushMessage_table")
@Data

public class PushMessage  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String sendMsg;
    
    
    
    
    
    private String productId;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String status;


    public static PushMessageRepository repository(){
        PushMessageRepository pushMessageRepository = CustomerManagementApplication.applicationContext.getBean(PushMessageRepository.class);
        return pushMessageRepository;
    }




    public static void messageNotified(CookStarted cookStarted){

        /** Example 1:  new item 
        PushMessage pushMessage = new PushMessage();
        repository().save(pushMessage);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookStarted.get???()).ifPresent(pushMessage->{
            
            pushMessage // do something
            repository().save(pushMessage);


         });
        */

        
    }
    public static void messageNotified(PointAssigned pointAssigned){

        /** Example 1:  new item 
        PushMessage pushMessage = new PushMessage();
        repository().save(pushMessage);

        */

        /** Example 2:  finding and process
        
        repository().findById(pointAssigned.get???()).ifPresent(pushMessage->{
            
            pushMessage // do something
            repository().save(pushMessage);


         });
        */

        
    }
    public static void messageNotified(Ordered ordered){

        /** Example 1:  new item 
        PushMessage pushMessage = new PushMessage();
        repository().save(pushMessage);

        */

        /** Example 2:  finding and process
        
        repository().findById(ordered.get???()).ifPresent(pushMessage->{
            
            pushMessage // do something
            repository().save(pushMessage);


         });
        */

        
    }
    public static void messageNotified(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        PushMessage pushMessage = new PushMessage();
        repository().save(pushMessage);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(pushMessage->{
            
            pushMessage // do something
            repository().save(pushMessage);


         });
        */

        
    }
    public static void messageNotified(PaymentCanceled paymentCanceled){

        /** Example 1:  new item 
        PushMessage pushMessage = new PushMessage();
        repository().save(pushMessage);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentCanceled.get???()).ifPresent(pushMessage->{
            
            pushMessage // do something
            repository().save(pushMessage);


         });
        */

        
    }


}
