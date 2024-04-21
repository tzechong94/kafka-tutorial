package com.kafkatutorial.cabbookdriver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.kafkatutorial.cabbookdriver.constant.AppConstant;

@Configuration
public class KafkaConfig {

    // create a topic

    @Bean
    public NewTopic topic() {
        return TopicBuilder
            .name(AppConstant.CAB_LOCATION)
            .build();
    }
}
