package com.example.Complaintapp_backend.controller;

import com.example.Complaintapp_backend.dao.UserDao;
import com.example.Complaintapp_backend.model.UserModel;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class UserController {

    @Autowired
    private UserDao uDao;

            @GetMapping("/")
            public String HomePage(){
                return "welcome";
            }

    @PostMapping(path = "/userReg",consumes = "application/json", produces ="application/json")
        public HashMap<String,String> UserRegistration(@RequestBody UserModel um){
        uDao.save(um);
        HashMap<String,String> hm= new HashMap<>();
       hm.put("status","success");
        return hm;
    }



}
