package com.oussema.Projet_Rest.service;


import com.oussema.Projet_Rest.model.user;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public interface userService {

    // add user
    user addUser(user u);

    // get user by id

    user login(String email, String password) throws Exception;

}
