package com.rabbitmq.poc.controller;

import com.rabbitmq.poc.producer.RabbitMQHappyQueueProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQController {

    private RabbitMQHappyQueueProducer rabbitMQHappyQueueProducer;

    @Autowired
    public RabbitMQController(RabbitMQHappyQueueProducer rabbitMQHappyQueueProducer){
        this.rabbitMQHappyQueueProducer = rabbitMQHappyQueueProducer;
    }

    @PostMapping("/poc")
    public void pocRabbitMQ(@RequestBody String message){
        rabbitMQHappyQueueProducer.sendMessage(message);
    }
}
