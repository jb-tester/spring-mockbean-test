package org.example.springmockbeantest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MyConfigProperties.class)
@ConfigurationPropertiesScan
public class SpringMockbeanTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMockbeanTestApplication.class, args);
    }

}
