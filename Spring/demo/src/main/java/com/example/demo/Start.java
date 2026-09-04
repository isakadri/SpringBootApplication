package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Start implements ApplicationRunner {

    PaymentProperties paymentProperties;

    public Start(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }



    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(paymentProperties.toString());
    }
}
