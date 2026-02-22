package com.example.aws_deployment_ci_cd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String Hello(){
        return "Hello from CI/CD Pipeline...Hi, haav vyi kya haal hai";
    }
}
