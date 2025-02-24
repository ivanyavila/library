package com.rest.userservice.services;

import com.rest.userservice.entities.User;
import com.rest.userservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Retrieves all Users from the database.
     *
     * @return a list of users.
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
