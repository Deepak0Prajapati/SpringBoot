package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringbootApplication::main).with(TestSpringbootApplication.class).run(args);
	}

}
