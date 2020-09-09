package dev.leduclinh.blog.controllers;

import dev.leduclinh.blog.domain.requests.UserRegister;
import dev.leduclinh.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserRegister userRegister) {
        service.registerUser(userRegister);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/")
    public ResponseEntity<?> hello() {
        return new ResponseEntity<>("ok",HttpStatus.OK);
    }

}