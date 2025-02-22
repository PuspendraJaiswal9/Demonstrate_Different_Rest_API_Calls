package com.example.Demonstrate_Different_Rest_API_Calls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/hi")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
