package teamcapstonecafe.infra;

import teamcapstonecafe.domain.*;
import teamcapstonecafe.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class MenuListViewHandler {

    @Autowired
    private MenuListRepository menuListRepository;





}

