package com.ben.devopsintegrationjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationJenkinsApplication {

    @GetMapping("/message")
    public String message(){
        return "Hello Mohamed From Jenkins";
    }
    public static void main(String[] args) {
        SpringApplication.run(DevopsIntegrationJenkinsApplication.class, args);
    }

}
