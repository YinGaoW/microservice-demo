package com.wyg.microservicedemoproviderdept8003.service;


import com.wyg.entity.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WangYingao
 * @date 2019/3/10 18:38
 */
@Service
public interface DeptService {
    List<Dept> listDept();
    Dept getDeptById(Integer id);
    Boolean addDept(Dept dept);
}
