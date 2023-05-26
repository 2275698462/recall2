package com.itheima.service.impl.kafka;

import com.itheima.service.MessageService;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceKafkaImpl implements MessageService {

    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已经纳入处理队列（kafka） id=" + id);
        kafkaTemplate.send("it2022", id);
    }

    @Override
    public String doMessage() {
        return null;
    }
}
