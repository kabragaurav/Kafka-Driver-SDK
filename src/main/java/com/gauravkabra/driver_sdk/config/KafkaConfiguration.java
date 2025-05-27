package com.gauravkabra.driver_sdk.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.gauravkabra.driver_sdk.constants.AppConstants.CAB_LOCATION_TOPIC_NAME;

@Configuration
public class KafkaConfiguration {

    /**
     * CLI maps to
     * bin/kafka-topics.sh --create --topic cab-location --bootstrap-server localhost:9092
     */
    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(CAB_LOCATION_TOPIC_NAME)
                .build();
    }
}
