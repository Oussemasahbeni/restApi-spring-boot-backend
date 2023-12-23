package com.oussema.Projet_Rest.controller;


import com.oussema.Projet_Rest.model.user;
import com.oussema.Projet_Rest.service.userService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class userController {

    private final userService userService1;

    public userController(userService userService1) {
        this.userService1 = userService1;
    }

    @PostMapping("/Signup")
    public @ResponseBody  user addUser(@RequestBody user u) {
        System.out.println(u);
        return userService1.addUser(u);
    }

    @PostMapping("/Login")
    public  @ResponseBody user login(@RequestBody user u) throws Exception{
        String email = u.getEmail();
        String password = u.getPassword();
        return userService1.login(email,password) ;
    }

}
