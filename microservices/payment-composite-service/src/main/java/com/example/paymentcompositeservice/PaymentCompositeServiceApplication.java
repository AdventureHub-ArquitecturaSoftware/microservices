package com.example.paymentcompositeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class PaymentCompositeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentCompositeServiceApplication.class, args);
	}

}
