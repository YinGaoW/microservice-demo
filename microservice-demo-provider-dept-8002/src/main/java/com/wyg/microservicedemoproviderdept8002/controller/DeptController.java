package com.wyg.microservicedemoproviderdept8002.controller;


import com.wyg.entity.Dept;
import com.wyg.microservicedemoproviderdept8002.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author WangYingao
 * @date 2019/3/10 18:41
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient client;

    @GetMapping("/dept")
    List<Dept> listDept(){
        return deptService.listDept();
    }

    @GetMapping("/dept/{id}")
    Dept getDeptById(@PathVariable Integer id){
        return deptService.getDeptById(id);
    }

    @PostMapping("/dept")
    Boolean addDept(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/discovery")
    public Object discovery(){
        List<String> list = client.getServices();
        System.out.println("*********"+list);
        List<ServiceInstance> serviceInstanceList = client.getInstances("MICROSERVICE-DEPT");
        for(ServiceInstance s : serviceInstanceList){
            System.out.println(s.getServiceId()+"\t"+s.getHost()+"\t"+s.getPort()+"\t"+s.getUri());
        }
        return this.client;
    }
}
