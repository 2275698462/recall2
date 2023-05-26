package com.itheima.service.impl.activemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

//@Component
public class MessageListener {

    @JmsListener(destination = "order.queue.id")
    public void receive(String id){
        System.out.println("已完成业务 id=" + id);
    }
}
