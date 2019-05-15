package com.wyg.microservicedemoproviderdept8003;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.wyg.microservicedemoproviderdept8003.mapper"})
public class MicroserviceDemoProviderDept8003Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDemoProviderDept8003Application.class, args);
	}

}
