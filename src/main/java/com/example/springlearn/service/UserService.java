package com.example.springlearn.service;


import com.example.springlearn.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void getUserById(Long id) {

        System.out.println(userRepository.getUserById(id));
    }

}
