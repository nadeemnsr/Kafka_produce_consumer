package com.kafka.publisher.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Course {
    @JsonProperty
    private String name;
    @JsonProperty
    private int duration;

    public Course() {}

    public Course(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}