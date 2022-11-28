package com.example.mobile_covers_backend.controller;

import com.example.mobile_covers_backend.models.User;
import com.example.mobile_covers_backend.repository.User_Repo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class User_Controller {
    @Autowired
    User_Repo user_repo;

    @GetMapping("/findallusers")
    public List<User> FindAllUsers(){
        return user_repo.findAll();
    }

    @GetMapping("/finduserbyid/{id}")
    public User findUserById(@PathVariable String id){
        System.out.println(id);
        return user_repo.getbyuserid(id);
    }

    @GetMapping("/finduserbyemail/{email}")
    public User finduserbyemail(@PathVariable String email){
        return user_repo.getByUser_email(email);
    }

    @PostMapping("/registeruser")
    public User SaveUser(@RequestBody User user){
        user_repo.save(user);
        return user;
    }


}
