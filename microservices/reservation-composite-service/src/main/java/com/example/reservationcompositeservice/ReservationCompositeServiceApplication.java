package com.example.reservationcompositeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class ReservationCompositeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservationCompositeServiceApplication.class, args);
    }

}
