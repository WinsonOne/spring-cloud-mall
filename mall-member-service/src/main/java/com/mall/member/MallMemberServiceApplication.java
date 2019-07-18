package com.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Theon
 * 项目启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MallMemberServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallMemberServiceApplication.class, args);
	}

}
