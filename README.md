curl -d "bugbugB" -H "Content-Type: application/json" -X POST http://localhost:8080/poc

check log
RabbitMQHappyQueueProducer       : Send message -> bugbugB
RabbitMQHappyQueueConsumer       : Received message -> bugbugB