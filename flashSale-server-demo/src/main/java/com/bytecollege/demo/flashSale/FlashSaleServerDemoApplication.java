package com.bytecollege.demo.flashSale;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo(scanBasePackages="com.bytecollege.demo.flashSale")
@SpringBootApplication
public class FlashSaleServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlashSaleServerDemoApplication.class, args);
	}

}
