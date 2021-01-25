package org.hdxy.springcloud.controller;

import org.hdxy.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {
    //消费者 不该有service
    //通过RestTemplate调用远程的服务 需要前注册到Spring中
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL = "http://localhost:8001";

    @RequestMapping("consumer/dept/add")
    public  boolean add(Dept dept){
        System.out.println(dept);
        return restTemplate.postForObject(REST_URL+"/dept/add",dept,Boolean.class);
    }

    //url 实体 responseType
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL+"/dept/get/"+id,Dept.class);
    }
    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL+"dept/list",List.class);
    }
}
