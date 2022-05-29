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

    /**
     * UC2
     *Make REST Call to show Hello
     * Mark from BridgeLabz
     * - Use GET Request Method and pass name as
     * query parameter
     * - Use CURL to demonstrate the REST API Call
     * - curl localhost:8080/hello/query?name=Mark
     * -w "\n"
     *
     */
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam String name){
        return "Hello "+ name +" from bridgelabz";
    }
    @GetMapping( {"/query1"})
    public String sayHelloQuey(@RequestParam String name){
        return "Hello "+ name +" !";
    }

    /**
     * UC3
     * Make REST Call to show Hello
     * Mark from BridgeLabz
     * - Use GET Request Method and pass name as
     * path variable
     * - Use CURL to demonstrate the REST API Call
     * - curl localhost:8080/hello/param/Mark -w
     * "\n"
     */
    //pathvaraiable
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable(value = "name") String name){
        return "Hello "+ name +" from bridgelabz";
    }

    @GetMapping( {"/query2"})
    public String sayHelloQuey(@RequestParam String fname,@RequestParam String lname){
        return "Hello "+ fname +" "+lname + "!";
    }

}