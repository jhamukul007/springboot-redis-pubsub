package com.messaging.springbootredispubsub.configs.consumers;

import com.messaging.springbootredispubsub.services.consumers.RedisMessageConsumer;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.serializer.RedisSerializer;

    @Configuration
    @AllArgsConstructor
    public class RedisConsumerConfig {

        private final RedisMessageConsumer consumer;
        private final ChannelTopic topic;

        @Bean
        RedisMessageListenerContainer redisContainer(JedisConnectionFactory jedisConnectionFactory) {
            RedisMessageListenerContainer container = new RedisMessageListenerContainer();
            container.setConnectionFactory(jedisConnectionFactory);
            container.setTopicSerializer(RedisSerializer.string());
            container.addMessageListener(consumer, topic);
            return container;
        }
    }
