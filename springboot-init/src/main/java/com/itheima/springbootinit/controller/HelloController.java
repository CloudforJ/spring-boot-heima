package com.itheima.springbootinit.controller;

import com.itheima.springbootinit.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @Value("${person.name}")
    private String name1;

    @Value("${person.age}")
    private int age;

    @Value("${address[0]}")
    private String address;

    @Value("${msg1}")
    private String msg1;

    @Value("${msg2}")
    private String msg2;

    @Autowired
    private Environment env;

    @Autowired
    private Person person;

    @GetMapping("/hello")
    public String hello() {
        System.out.println(env.getProperty("person.name"));
        System.out.println(env.getProperty("address[0]"));
        return "hello spring boot2";
    }

    @GetMapping("/name")
    public String handleName() {
        return name;
    }

    @GetMapping("/person")
    public Map<String, Integer> doPerson() {
        Map<String, Integer> map = new HashMap<>();
        map.put(name1, age);
        return map;
    }

    @GetMapping("/address")
    public String getAddress() {
        return address;
    }

    @GetMapping("/msg1")
    public String getMsg1() {
        return msg1;
    }

    @GetMapping("/msg2")
    public String getMsg2() {
        System.out.println(msg2);
        return msg2;
    }

    @GetMapping("/personObj")
    public Person objPerson() {
        return person;
    }
}
