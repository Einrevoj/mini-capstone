package com.example.minicapstone.controller;

import com.example.minicapstone.model.HelloWorldRequest;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/helloWorld")
@RequiredArgsConstructor
public class HelloWorldController {
    @GetMapping("")
    public String getHelloWorld() {
        return "Hello World";
    }
    @PostMapping("/custom")
    public String updateHello(@RequestBody HelloWorldRequest helloWorldRequest) {
        return "Hello ".concat(helloWorldRequest.getFirstName()).concat(" ".concat(helloWorldRequest.getLastName()));

    }
    @PutMapping("/add/{newTask}")
    public String updateHelloWorld(@PathVariable @NonNull String newTask) {
        return "Hello ".concat(newTask);
    }
}
