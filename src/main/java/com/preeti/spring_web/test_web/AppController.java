package com.preeti.spring_web.test_web;

import com.preeti.spring_web.test_web.data.LoginRequest;
import com.preeti.spring_web.test_web.data.LoginResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    class Test {
        public Test() {
            super();
        }
        public int getId() {
            return 1;
        }
    }

    @GetMapping
    public Test home() {
        return new Test();
    }

    @GetMapping(path = "error")
    public String error() {
        return "Some error";
    }

    @PostMapping(path = "login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        return new LoginResponse(request.getUsername(), "Sample Token");
    }
}
