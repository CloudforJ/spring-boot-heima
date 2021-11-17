package com.itheima.springbootcondition.config;

import com.itheima.springbootcondition.condition.ClassCondition;
import com.itheima.springbootcondition.condition.ConditiononClass;
import com.itheima.springbootcondition.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    //@Conditional(ClassCondition.class)
    @ConditiononClass(values = "redis.clients.jedis.Jedis")
    public User user() {
        return new User();
    }
}
