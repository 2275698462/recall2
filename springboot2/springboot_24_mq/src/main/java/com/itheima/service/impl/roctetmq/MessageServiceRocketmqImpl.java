package com.itheima.service.impl.roctetmq;

import com.itheima.service.MessageService;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class MessageServiceRocketmqImpl implements MessageService {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已经纳入处理队列（rocketmq） id=" + id);
        rocketMQTemplate.convertAndSend("order_id", id);
    }

    @Override
    public String doMessage() {
        return null;
    }
}
