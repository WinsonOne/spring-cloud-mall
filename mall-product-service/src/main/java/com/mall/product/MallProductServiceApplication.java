package com.mall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Theone
 * 项目启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MallProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallProductServiceApplication.class, args);
	}

}
