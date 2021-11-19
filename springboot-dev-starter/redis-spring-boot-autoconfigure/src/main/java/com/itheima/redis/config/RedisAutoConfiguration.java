package com.itheima.redis.config;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RedisPropertiesPro.class)
public class RedisAutoConfiguration {

    @Bean
    public RedisProperties jedis(RedisPropertiesPro redisPropertiesPro) {
        RedisProperties redisProperties = new RedisProperties();
        redisProperties.setHost(redisPropertiesPro.getHost());
        redisProperties.setPort(redisPropertiesPro.getPort());
        return redisProperties;
    }
}
