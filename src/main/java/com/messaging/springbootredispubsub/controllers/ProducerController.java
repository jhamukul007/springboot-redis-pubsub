package com.messaging.springbootredispubsub.controllers;

import com.messaging.springbootredispubsub.configs.RedisData;
import com.messaging.springbootredispubsub.services.RedisProducer;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messaging")
@AllArgsConstructor
public class ProducerController {

    private final RedisProducer redisProducer;

    @PostMapping(value = "/produce")
    public ResponseEntity<String> producer(@RequestBody RedisData redisData){
        redisProducer.publish(redisData);
        return new ResponseEntity<>("Success !!! ", HttpStatus.OK);
    }

}
