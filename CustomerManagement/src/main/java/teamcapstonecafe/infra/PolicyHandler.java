package teamcapstonecafe.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import teamcapstonecafe.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import teamcapstonecafe.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired PushMessageRepository pushMessageRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookStarted'")
    public void wheneverCookStarted_MessageNotified(@Payload CookStarted cookStarted){

        CookStarted event = cookStarted;
        System.out.println("\n\n##### listener MessageNotified : " + cookStarted + "\n\n");


        

        // Sample Logic //
        PushMessage.messageNotified(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PointAssigned'")
    public void wheneverPointAssigned_MessageNotified(@Payload PointAssigned pointAssigned){

        PointAssigned event = pointAssigned;
        System.out.println("\n\n##### listener MessageNotified : " + pointAssigned + "\n\n");


        

        // Sample Logic //
        PushMessage.messageNotified(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Ordered'")
    public void wheneverOrdered_MessageNotified(@Payload Ordered ordered){

        Ordered event = ordered;
        System.out.println("\n\n##### listener MessageNotified : " + ordered + "\n\n");


        

        // Sample Logic //
        PushMessage.messageNotified(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCanceled'")
    public void wheneverOrderCanceled_MessageNotified(@Payload OrderCanceled orderCanceled){

        OrderCanceled event = orderCanceled;
        System.out.println("\n\n##### listener MessageNotified : " + orderCanceled + "\n\n");


        

        // Sample Logic //
        PushMessage.messageNotified(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PaymentCanceled'")
    public void wheneverPaymentCanceled_MessageNotified(@Payload PaymentCanceled paymentCanceled){

        PaymentCanceled event = paymentCanceled;
        System.out.println("\n\n##### listener MessageNotified : " + paymentCanceled + "\n\n");


        

        // Sample Logic //
        PushMessage.messageNotified(event);
        

        

    }

}


