package com.example.Complaintapp_backend.controller;

import jakarta.persistence.GeneratedValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

 @GeneratedValue("/")
    public String HomePage(){
        return "welcome page";
    }

}
