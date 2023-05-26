package com.itheima.service.impl.rabbitmq.direct.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
public class Listener {

    @RabbitListener(queues = "direct_queue")
    public void receive(String id){
        System.out.println("已完成业务(rabbitmq direct) id=" + id);
    }
}
