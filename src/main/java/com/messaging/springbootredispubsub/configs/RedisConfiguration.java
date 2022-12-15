package com.messaging.springbootredispubsub.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration
public class RedisConfiguration {

    @Bean
    JedisConnectionFactory getConnectionFactory(){
        // Using DEFAULT_HOST = "localhost"; and DEFAULT_PORT = 6379;
        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration();
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(config);
        return jedisConnectionFactory;
    }

}
