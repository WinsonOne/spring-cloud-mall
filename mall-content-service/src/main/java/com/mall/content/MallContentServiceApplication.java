package com.mall.content;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Theone
 * 项目启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MallContentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallContentServiceApplication.class, args);
	}

}
