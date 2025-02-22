package com.example.Demonstrate_Different_Rest_API_Calls;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/hi")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }


    @GetMapping("/h")
    public String sayHelloMark(@RequestParam String name){
        return "Hello "+name+" from BridgeLabz";
    }

    @GetMapping("/param/{name}")
    public String sayHelloUsingPathVariable(@PathVariable String name){
        return "Hello "+name+" from BridgeLabz";
    }

    @PostMapping("/post")
    public String sayHelloUsingPostMapping(@RequestBody DataUser user){
        return "Hello "+user.getFirstName()+" "+user.getLastName()+" from BridgeLabz";
    }
}
