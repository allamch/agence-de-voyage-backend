package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lenovo on 8/15/2019.
 */
@RestController
public class WelcomeController {
    @GetMapping(path= "/hello-word")
    public String helloWorld(){
        return "Hello Word";
    }
    @GetMapping(path  = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        HelloWorldBean h = new HelloWorldBean("Hamza");
      //  h.setMessage("Hamza");
        return h;
    }
    @GetMapping(path = "/hello-word/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
