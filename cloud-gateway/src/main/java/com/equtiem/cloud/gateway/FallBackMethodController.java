package com.equtiem.cloud.gateway;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBack(){
        return "User Service is not working";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBack(){
        return "Department Service is not working";
    }
}
