package com.dtech.restservices.services.user;

import java.util.List;

import com.dtech.restservices.entities.user.User;
import com.dtech.restservices.repositories.user.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Business Logic should be in Services

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User create(User user) {
        return userRepository.save(user);
    }
}