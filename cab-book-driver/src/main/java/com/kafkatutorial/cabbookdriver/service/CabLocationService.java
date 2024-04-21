package com.kafkatutorial.cabbookdriver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafkatutorial.cabbookdriver.constant.AppConstant;

@Service
public class CabLocationService {
    // use kafka template create template for storing data to apache cluster
    // what tpe of map combination, what key value combination to use, which topic to send data

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public boolean updateLocation(String location){
        kafkaTemplate.send(AppConstant.CAB_LOCATION, location); 
        // automatically create topic cab location
        return true;
    }
}
