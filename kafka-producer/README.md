# Kafka Producer Module

This is the Kafka Producer module that publishes messages to a Kafka topic.

## Features

- REST API endpoint to publish messages
- Spring Boot integration
- Configurable Kafka bootstrap servers

## Running the Application

```bash
mvn clean install
mvn spring-boot:run -f kafka-producer/pom.xml
```

## API Usage

### Publish a Message

```bash
curl -X POST http://localhost:8080/api/kafka/publish \
  -H "Content-Type: application/json" \
  -d "Hello from Kafka Producer"
```

## Configuration

Configure the Kafka producer settings in `application.properties`:
- `spring.kafka.bootstrap-servers`: Kafka broker address
- `server.port`: Application port (8080)

## Architecture

- `KafkaProducerApplication`: Main Spring Boot application
- `KafkaProducerConfig`: Kafka producer configuration with KafkaTemplate
- `KafkaProducerService`: Service that sends messages to Kafka topic
- `KafkaProducerController`: REST controller for publishing messages
