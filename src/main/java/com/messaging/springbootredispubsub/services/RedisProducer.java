package com.messaging.springbootredispubsub.services;

import com.messaging.springbootredispubsub.configs.RedisData;

public interface RedisProducer {
    void publish(RedisData redisData);
}
