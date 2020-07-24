package com.example.dockerjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@SpringBootApplication
public class DockerJavaApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DockerJavaApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DockerJavaApplication.class);
    }

    @GetMapping("/")
    public String hellow(){
        return "Hello World!!! " + new Date().toString();
    }
}
