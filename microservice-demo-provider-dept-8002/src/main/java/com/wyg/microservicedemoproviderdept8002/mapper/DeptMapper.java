package com.wyg.microservicedemoproviderdept8002.mapper;


import com.wyg.entity.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * @author WangYingao
 * @date 2019/3/10 18:10
 */
public interface DeptMapper {
    @Select("SELECT * FROM dept")
    List<Dept> listDept();

    @Select("SELECT * FROM dept WHERE id=#{id}")
    Dept getDeptById(Integer id);

    @Insert("INSERT INTO dept VALUES(null,#{deptNo},#{deptName},DATABASE())")
    Boolean addDept(Dept dept);
}
