package com.itheima.service.impl.rabbitmq.direct.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RabbitConfigDirect {

    @Bean
    public Queue directQueue(){ //存到这个消息队列
        return new Queue("direct_queue"); //名称
    }

    @Bean
    public Queue directQueue2(){ //存到这个消息队列
        return new Queue("direct_queue2"); //名称
    }

    @Bean
    public DirectExchange directExchange(){ //交换机，一个交换机可以绑定多个队列
        return new DirectExchange("directExchange");
    }

    @Bean
    public Binding bindingDirect(){ //做绑定
        return BindingBuilder.bind(directQueue()).to(directExchange()).with("direct");
    }

    @Bean
    public Binding bindingDirect2(){ //做绑定
        return BindingBuilder.bind(directQueue()).to(directExchange()).with("direct2");
    }
}
