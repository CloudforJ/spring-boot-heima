package com.example.springbootenable;

import com.itheima.config.EnableUser;
import com.itheima.config.MyImportSelector;
import com.itheima.config.UserConfig;
import com.itheima.domain.Role;
import com.itheima.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.Map;

@SpringBootApplication
//@ComponentScan("com.itheima.config")
//@Import(UserConfig.class)
//@EnableUser
//@Import(UserConfig.class)
@Import(MyImportSelector.class)
public class SpringbootEnableApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringbootEnableApplication.class, args);

        // get Bean
//        Object user = context.getBean("user");
//        System.out.println(user);

        User user = context.getBean(User.class);
        System.out.println(user);

        Role role = context.getBean(Role.class);
        System.out.println(role);

        Map<String, User> map = context.getBeansOfType(User.class);
        System.out.println(map);
    }



}
