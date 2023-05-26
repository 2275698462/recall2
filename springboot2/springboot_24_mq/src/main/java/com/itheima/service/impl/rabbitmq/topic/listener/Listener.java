package com.itheima.service.impl.rabbitmq.topic.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
public class Listener {

    @RabbitListener(queues = "topic_queue")
    public void receive(String id){
        System.out.println("已完成业务(rabbitmq topic 1) id=" + id);
    }


    @RabbitListener(queues = "topic_queue2")
    public void receive2(String id){
        System.out.println("已完成业务(rabbitmq topic 2222) id=" + id);
    }

}
