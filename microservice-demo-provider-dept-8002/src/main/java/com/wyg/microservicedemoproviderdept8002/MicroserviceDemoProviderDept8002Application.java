package com.wyg.microservicedemoproviderdept8002;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.wyg.microservicedemoproviderdept8002.mapper"})
public class MicroserviceDemoProviderDept8002Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDemoProviderDept8002Application.class, args);
	}

}
