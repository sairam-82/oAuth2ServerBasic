package com.example.oAuth.controllers;

import com.example.oAuth.entities.User;
import com.example.oAuth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/api/v1")
public class BasicController {

//    @Autowired
//    private UserRepository userRepository;

    @GetMapping("/authentication")
    public String getAuthentication(){
        var u= SecurityContextHolder.getContext().getAuthentication();
        u.getAuthorities().forEach(a-> System.out.println(a));

        return "demo";

    }



}
