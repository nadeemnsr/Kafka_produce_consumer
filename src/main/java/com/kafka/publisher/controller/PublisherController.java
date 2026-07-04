package com.kafka.publisher.controller;

import com.kafka.publisher.dto.Course;
import com.kafka.publisher.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class PublisherController {

    @Autowired
    protected PublishService service;


    @PostMapping("/publish")
    private ResponseEntity<String> getMessage(@RequestBody Course course){
        return new ResponseEntity<String>(service.sendMessage(course), HttpStatus.OK);
    }

}
