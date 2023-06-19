package com.example.springlearn.controller;

import com.example.springlearn.model.User;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/users")
//@Controller
//@ResponseBody
public class UserController {

    @GetMapping
//    @RequestMapping(value = "/users", method = RequestMethod.GET)

    public List<User> findAll() {

        return List.of(new User(1L, "John"), new User(2L, "Bob"));
    }

    @GetMapping("/{id}")

    public User findById(@PathVariable Integer id) {

        return new User(1L, "John");
    }

    @GetMapping("/search")

    public User search(@RequestParam String name) {

        return new User(1L, "John");
    }

    @PostMapping
    public void save(@RequestBody User user) {

        System.out.println(user);
    }
}
