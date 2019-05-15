package com.wyg.microservicedemoconsumerdept8888.controller;

import com.wyg.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author WangYingao
 * @date 2019/3/10 19:00
 */
@RestController
@RequestMapping("/consumer")
public class DeptController {
    @Autowired
    private RestTemplate restTemplate;

//    private static final String URL_PREFIX="http://localhost:8001";
    private static final String URL_PREFIX="http://MICROSERVICE-DEPT";

    @PostMapping("/dept")
    public Boolean addDept(@RequestBody Dept dept){
        return restTemplate.postForObject(URL_PREFIX + "/dept",dept,Boolean.class);
    }

    @GetMapping("dept/{id}")
    public Dept getDeptById(@PathVariable Integer id){
        return restTemplate.getForObject(URL_PREFIX + "/dept/" + id,Dept.class);
    }

    @GetMapping("/dept")
    @SuppressWarnings("unchecked")
    public List<Dept> listDept(){
        return restTemplate.getForObject(URL_PREFIX + "/dept",List.class);
    }

    @GetMapping("/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(URL_PREFIX + "/dept/discovery",Object.class);
    }
}
