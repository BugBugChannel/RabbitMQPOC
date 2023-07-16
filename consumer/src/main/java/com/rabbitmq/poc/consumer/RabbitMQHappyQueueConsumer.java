package com.rabbitmq.poc.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQHappyQueueConsumer {

    @RabbitListener(queues = {"HelloQueue"})
    public void consume(String message){
        log.info("Received message -> {}", message);
    }
}
