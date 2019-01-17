package com.github.tubus.referenciesspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableConfigServer
public class ReferenciesSpringCloudConfigServerApplication {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(ReferenciesSpringCloudConfigServerApplication.class, args);

        // System.out.println(ac);
        /*
        example for output:
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@51549490, started on Mon Jan 14 10:45:38 MSK 2019, parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@5ae50ce6
        */

        // System.out.println(ac.getParent());
        /*
        example for output:
        org.springframework.context.annotation.AnnotationConfigApplicationContext@5ae50ce6, started on Mon Jan 14 10:45:38 MSK 2019
         */
    }
}