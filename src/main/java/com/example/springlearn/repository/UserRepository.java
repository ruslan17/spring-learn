package com.example.springlearn.repository;

import com.example.springlearn.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUserById(Long id) {
        return new User(1L, "John");
    }

}
