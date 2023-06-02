package com.adventurehub.microservices.core.payment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.adventurehub")
public class PaymentServiceApplication {

    private  static final Logger LOG = LoggerFactory.getLogger(PaymentServiceApplication.class);

    public static void main(String[] args) {
        //SpringApplication.run(PaymentServiceApplication.class, args);

        ConfigurableApplicationContext ctx = SpringApplication.run(PaymentServiceApplication.class);

        String mysqlUri = ctx.getEnvironment().getProperty("spring.database.url");
        LOG.info("Connected to MySQL: " + mysqlUri);
    }

}
