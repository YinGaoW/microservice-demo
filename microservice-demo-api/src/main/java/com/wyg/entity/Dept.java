package com.wyg.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WangYingao
 * @date 2019/3/11 13:13
 */
@Data
@NoArgsConstructor
public class Dept {
    private Integer id;
    private String deptNo;
    private String deptName;
    private String dbSource;
}
