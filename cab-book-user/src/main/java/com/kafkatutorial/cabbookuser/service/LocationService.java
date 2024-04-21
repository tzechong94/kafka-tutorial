package com.kafkatutorial.cabbookuser.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    
    // create kafka listener

    @KafkaListener(topics = "cab-location", groupId = "user-group")
    public void cabLocation(String location) {
        System.out.println(location);
    }
}
