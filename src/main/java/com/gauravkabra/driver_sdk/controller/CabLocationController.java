package com.gauravkabra.driver_sdk.controller;

import com.gauravkabra.driver_sdk.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/location")
public class CabLocationController {
    private final Random random = new Random();

    @Autowired
    private CabLocationService cabLocationService;

    @PutMapping
    public ResponseEntity getCabLocation() throws InterruptedException {
        Thread.sleep(2000);
        String location = "Location was updated to (" + random.nextInt() + ", " + random.nextInt() + ")";
        cabLocationService.updateLocation(location);
        // consumed by API clients like Postman
        // This is response shown as PUT's response
        return new ResponseEntity(Map.of("msg from driver", location), HttpStatus.OK);
    }
}
