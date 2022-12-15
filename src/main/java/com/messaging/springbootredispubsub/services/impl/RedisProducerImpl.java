package com.messaging.springbootredispubsub.services.impl;

import com.messaging.springbootredispubsub.configs.RedisData;
import com.messaging.springbootredispubsub.services.RedisProducer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class RedisProducerImpl implements RedisProducer {

    private final RedisTemplate<String, Object> redisTemplate;
    private final ChannelTopic channelTopic;

    @Override
    public void publish(RedisData redisData) {
        log.info("Publishing message on Redis channel {} with content: {}", channelTopic.getTopic(), redisData);
        redisTemplate.convertAndSend(channelTopic.getTopic(), redisData);
    }

}
