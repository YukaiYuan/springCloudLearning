package com.cloudclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过注解@EnableEurekaClient 表明自己是一个eurekaclient.
 */
@EnableEurekaClient
@SpringBootApplication
@RestController
public class CloudclientApplication {

	@Value("${server.port}")
	String port;

	public static void main(String[] args) {
		SpringApplication.run(CloudclientApplication.class, args);
	}

	@RequestMapping("/hello")
	public String hello(@RequestParam String name){
		return "hello"+name+",this is "+port;
	}
}
