package com.adam.example.controller;

import com.adam.example.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(path="/hello", method= RequestMethod.GET, produces = "application/json")
    public Greeting getHello(){
        Greeting greeting = new Greeting();
        greeting.setHello("World");
        return new Greeting();
    }


}
