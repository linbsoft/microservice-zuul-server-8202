package com.linbsoft.microservicezuulserver8202;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class MicroserviceZuulServer8202Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceZuulServer8202Application.class, args);
	}

}

