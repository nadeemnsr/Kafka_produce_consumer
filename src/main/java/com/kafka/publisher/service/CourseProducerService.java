package com.kafka.publisher.service;

import com.kafka.publisher.dto.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CourseProducerService {

    @Autowired
    private KafkaTemplate<String, Course> template;

    public String sendMessage(Course course) {
        template.send("my-topic", "p1", course);
        return "Course Message sent to the Kafka server successfully";
    }
}
