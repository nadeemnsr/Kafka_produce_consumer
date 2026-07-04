# Kafka Consumer Module

This is the Kafka Consumer module that consumes messages published by the Kafka Producer module.

## Features

- Listens to Kafka topics
- Consumes messages from producer
- Spring Boot integration
- Configurable consumer groups

## Running the Application

```bash
mvn clean install
mvn spring-boot:run
```

## Configuration

Configure the Kafka consumer settings in `application.properties`:
- `spring.kafka.bootstrap-servers`: Kafka broker address
- `spring.kafka.consumer.group-id`: Consumer group ID
- `spring.kafka.consumer.auto-offset-reset`: Offset reset policy

## Architecture

- `KafkaConsumerApplication`: Main Spring Boot application
- `KafkaConsumerConfig`: Kafka consumer configuration
- `KafkaConsumerService`: Service that listens to Kafka topics and processes messages
