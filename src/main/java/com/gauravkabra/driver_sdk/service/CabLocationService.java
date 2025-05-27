package com.gauravkabra.driver_sdk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.gauravkabra.driver_sdk.constants.AppConstants.CAB_LOCATION_TOPIC_NAME;

@Service
public class CabLocationService {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void updateLocation(String location) {
        kafkaTemplate.send(CAB_LOCATION_TOPIC_NAME, location);
    }
}
