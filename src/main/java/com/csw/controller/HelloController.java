package com.csw.controller;

import com.csw.entity.User;
import com.csw.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/10/30.
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    private String names;
    private String port;
    private Double price;
    private Integer age;
    private String[] qqs;
    private List<String> strs;
    private Map<String, String> maps;
    @Autowired
    private User user;
    @Autowired
    private HelloService helloService;
    @Autowired
    private Calendar calendar;
    @Autowired
    private Connection connection;


    @RequestMapping("hello")
    public String hello() {
        System.out.println("names//:" + names);
        System.out.println("port//:" + port);
        System.out.println("age//:" + age);
        System.out.println("price//:" + price);
        for (String qq : qqs) {
            System.out.println("qqs//:" + qq);
        }
        System.out.println("________List________");
        strs.forEach(str -> System.out.println(str));
        System.out.println("____map______");
        maps.forEach((k, v) -> System.out.println("key//:" + k + "value//:" + v));
        System.out.println("user//:" + user);
        System.out.println("user中的map");
        user.getMaps().forEach((k, v) -> System.out.println(""));
        System.out.println("hello springboot");
        return "hello springboot";
    }

}
