package com.mall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Theone
 * 项目启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MallOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallOrderServiceApplication.class, args);
	}

}
