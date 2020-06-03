package com.dtech.restservices.controllers.user;

import java.util.List;
import java.util.Optional;

import com.dtech.restservices.entities.user.User;
import com.dtech.restservices.services.user.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // Get All Users
    @GetMapping("/user/all")
    public List<User> getAll() {
        return userService.getAll();
    }

    // Get User by ID
    @RequestMapping(value="/user/{id}", method = RequestMethod.GET)
    public Optional<User> getById(@PathVariable("id") Long id){
        return userService.getById(id);
    }

    // Create User
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User create(@RequestBody User user) {
        return userService.create(user);
    }
    
    
}