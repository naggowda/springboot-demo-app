package com.example.demo.web;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("api/dummy")
public class DummyController {
    @GetMapping
    public String getHelloWorld(){
        return "Hello World";
    }
    @GetMapping("/{name}")
    public String getHelloWorldWithParam(@PathVariable String name){
        return "Hello World, " + name;
    }
    @GetMapping("paramsApi")
    public String getHelloWorldWithParams(@RequestParam String param){
        return "Hello World, parameter value: " + param;
    }
}