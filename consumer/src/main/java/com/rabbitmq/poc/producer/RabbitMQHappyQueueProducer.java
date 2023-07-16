package com.rabbitmq.poc.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQHappyQueueProducer {

    public static final String exchange = "HelloQueue";

    public static final String routingKey = "Hello";

    private RabbitTemplate rabbitTemplate;

    @Autowired
    public RabbitMQHappyQueueProducer(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String message){
        log.info("Send message -> {}", message);
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
    }
}
