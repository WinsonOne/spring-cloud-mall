package com.mall.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author TheOne
 * 项目启动类
 */
@SpringBootApplication
@EnableEurekaServer
public class MallEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallEurekaServerApplication.class, args);
	}

}
