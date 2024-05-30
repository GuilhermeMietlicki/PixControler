package com.pix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.pix.entity")
@SpringBootApplication
public class PixConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PixConnectApplication.class, args);
	}

}
