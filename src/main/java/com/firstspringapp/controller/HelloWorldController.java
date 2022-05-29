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


    /**
     * UC4
     * Make REST Call to show Hello Mark
     * Taylor from BridgeLabz
     * - Use POST Request Method and pass first name and
     * last name in the Body
     * - Create User DTO Bean with firstName and lastName as
     * attributes.
     * - Use CURL to demonstrate the REST API Call
     * - curl -X POST -H "Content-Type: application/json" -d
     * '{"firstName": ”Mark","lastName": ”Taylor"}'
     * "http://localhost:8080/hello/create-user" -w "\n"
     */
    @PostMapping (value = {"/create-user","/post"})
    public String sayHello(@RequestBody User user){
        return "Hello "+user.getFirstName() + " " +user.getLastName() +" !";
    }

}