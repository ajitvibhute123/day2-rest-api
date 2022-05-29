package com.firstspringapp.controller;

import com.firstspringapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    /**
     * UC1
     * Create a Rest Controller to demonstrate
     * the various HTTP Methods and respond
     * hello messages to the User. To begin
     * with show Hello from BridgeLabz
     * - Use GET Request Method
     * - Use CURL to demonstrate the REST API Call
     * - curl localhost:8080/hello -w "\n"
     *purpose : Warn the request mapping is done then all the statements  of sayHello gets executed
     * @return Hello World
     */
    @GetMapping(value = {"","/","/home"})
    public String sayHello(){
        return "Hello World!!!";
    }
}