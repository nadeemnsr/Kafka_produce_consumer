package com.kafka.publisher.controller;

import com.kafka.publisher.dto.Course;
import com.kafka.publisher.service.CourseProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseProducerService courseProducerService;

    @PostMapping("/publish")
    public ResponseEntity<String> publishCourse(@RequestBody Course course) {
        return new ResponseEntity<>(courseProducerService.sendMessage(course), HttpStatus.OK);
    }
}
