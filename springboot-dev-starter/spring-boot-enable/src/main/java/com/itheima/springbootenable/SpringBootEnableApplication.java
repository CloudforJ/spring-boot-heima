package com.itheima.springbootenable;

import com.itheima.redis.config.RedisPropertiesPro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class SpringBootEnableApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootEnableApplication.class, args);
        RedisPropertiesPro redisProperties = context.getBean(RedisPropertiesPro.class);
        System.out.println(redisProperties);

        RedisProperties redis = new RedisProperties();
        Jedis jedis = new Jedis(redisProperties.getHost(), redisProperties.getPort());
        jedis.set("name1", "itcast1");
        System.out.println(jedis.get("name1"));
    }

}
