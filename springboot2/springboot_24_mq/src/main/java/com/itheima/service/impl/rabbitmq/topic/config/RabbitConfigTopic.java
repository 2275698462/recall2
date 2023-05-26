package com.itheima.service.impl.rabbitmq.topic.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RabbitConfigTopic {

    @Bean
    public Queue topicQueue(){ //存到这个消息队列
        return new Queue("topic_queue"); //名称
    }

    @Bean
    public Queue topicQueue2(){ //存到这个消息队列
        return new Queue("topic_queue2"); //名称
    }

    @Bean
    public TopicExchange topicExchange(){ //交换机，一个交换机可以绑定多个队列
        return new TopicExchange("topicExchange");
    }



    @Bean
    public Binding bindingTopic(){ //做绑定
        return BindingBuilder.bind(topicQueue()).to(topicExchange()).with("topic.*.id");
        //使用同一个交换机通过绑定的设置能到不同队列中
    }

    @Bean
    public Binding bindingTopic2(){ //做绑定
        return BindingBuilder.bind(topicQueue2()).to(topicExchange()).with("topic.*.id");
    }
}
