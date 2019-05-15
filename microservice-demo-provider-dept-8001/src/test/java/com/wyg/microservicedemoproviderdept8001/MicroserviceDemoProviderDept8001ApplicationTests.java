package com.wyg.microservicedemoproviderdept8001;

import com.wyg.microservicedemoproviderdept8001.mapper.DeptMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroserviceDemoProviderDept8001ApplicationTests {
	@Autowired
	private DeptMapper deptMapper;

	@Test
	public void contextLoads() {
		System.out.println(deptMapper.listDept());
	}

}
