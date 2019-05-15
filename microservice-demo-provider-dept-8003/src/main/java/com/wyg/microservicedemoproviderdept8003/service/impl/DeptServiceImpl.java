package com.wyg.microservicedemoproviderdept8003.service.impl;


import com.wyg.entity.Dept;
import com.wyg.microservicedemoproviderdept8003.mapper.DeptMapper;
import com.wyg.microservicedemoproviderdept8003.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WangYingao
 * @date 2019/3/10 18:39
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> listDept() {
        return deptMapper.listDept();
    }

    @Override
    public Dept getDeptById(Integer id) {
        return deptMapper.getDeptById(id);
    }

    @Override
    public Boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }
}
