package com.oussema.Projet_Rest.service.ImplementedService;

import com.oussema.Projet_Rest.model.user;
import com.oussema.Projet_Rest.repository.userRepository;
import com.oussema.Projet_Rest.service.userService;
import org.springframework.stereotype.Service;

@Service
public class userServiceImp implements userService {

    private final userRepository userRepo;

    public userServiceImp(userRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public user addUser(user u)  {

        user u1 = userRepo.findByEmail(u.getEmail());
        if( u1 != null){
            throw new IllegalArgumentException("Email already exists");

        }

        return userRepo.save(u);
    }



    @Override
    public user login(String email, String password) throws Exception {
        try {
            user u1 = userRepo.findByEmail(email);

            if (u1 == null) {
                throw new Exception("User not found");
            }

            if (u1.getPassword().equals(password)) {
                return u1;
            } else {
                throw new Exception("Incorrect password");
            }
        } catch (Exception e) {
            throw new Exception("User not found");
        }
    }

}
