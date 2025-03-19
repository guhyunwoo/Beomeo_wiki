package com.example.beomeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class BeomeoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeomeoApplication.class, args);
    }

}
