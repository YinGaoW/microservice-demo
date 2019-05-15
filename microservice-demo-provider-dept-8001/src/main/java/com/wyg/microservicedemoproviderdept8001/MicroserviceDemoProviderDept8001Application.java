package com.wyg.microservicedemoproviderdept8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(basePackages = {"com.wyg.microservicedemoproviderdept8001.mapper"})
@EnableEurekaClient
public class MicroserviceDemoProviderDept8001Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDemoProviderDept8001Application.class, args);
	}

}
