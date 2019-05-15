package com.wyg.microservicedemoconsumerdeptfeign.controller;

import com.wyg.entity.Dept;
import com.wyg.service.DeptFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author WangYingao
 * @date 2019/3/11 16:15
 */
@RestController
@RequestMapping("/consumer")
public class DeptController {
    @Autowired
    private DeptFeignService deptFeignService;

    @GetMapping("/dept/{id}")
    public Dept getDeptById(@PathVariable("id") Integer id){
        return deptFeignService.getDeptById(id);
    }

    @GetMapping("/dept")
    public List<Dept> listDept(){
        return deptFeignService.listDept();
    }

    @PostMapping("/dept")
    Boolean addDept(@RequestBody Dept dept){
        return deptFeignService.addDept(dept);
    }
}
