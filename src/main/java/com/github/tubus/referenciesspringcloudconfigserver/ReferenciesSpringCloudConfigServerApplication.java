package com.github.tubus.referenciesspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ReferenciesSpringCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReferenciesSpringCloudConfigServerApplication.class, args);
    }
}