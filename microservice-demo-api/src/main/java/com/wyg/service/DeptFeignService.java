package com.wyg.service;

import com.wyg.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author WangYingao
 * @date 2019/3/11 16:07
 */
@FeignClient("MICROSERVICE-DEPT")
//@FeignClient("microservice-dept")
public interface DeptFeignService {
    @GetMapping("/dept/{id}")
    Dept getDeptById(@PathVariable("id") Integer id);

    @GetMapping("/dept")
    List<Dept> listDept();

    @PostMapping("/dept")
    Boolean addDept(@RequestBody Dept dept);
}
