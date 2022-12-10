package com.example.Complaintapp_backend.controller;

import com.example.Complaintapp_backend.dao.UserDao;
import com.example.Complaintapp_backend.model.UserModel;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UserController {

    @Autowired
    private UserDao udao;
 @GetMapping("/")
    public String HomePage(){
        return "welcome page";
    }
    @PostMapping(path="/userReg", consumes= "application/json", produces ="application/json")
    public HashMap<String, String> UserRegistration(@RequestBody UserModel um){
     udao.save(um);
     HashMap<String, String>hm=new HashMap<>();
     hm.put("status","success");
     return hm ;

    }


}
