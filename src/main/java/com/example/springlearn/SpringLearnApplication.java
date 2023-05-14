package com.example.springlearn;

import com.example.springlearn.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * дефолтный скоуп спринг бина - синглтон
 * спринг бины - аннотации для создания: @Component, @Repository, @Service, @Controller // @Bean
 */
//@RequiredArgsConstructor
@SpringBootApplication
public class SpringLearnApplication implements ApplicationRunner {

    // 1 вариант инжекта/автовайринг/внедрение - через поле
    // @Autowired   //  or @Inject
    // UserService userService;

    private final UserService userService;


    // 3 вариант инжекта/автовайринг/внедрение - через конструктор
    public SpringLearnApplication(UserService userService) {

        this.userService = userService;
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringLearnApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {

        userService.getUserById(1L);
    }

// 2 вариант инжекта/автовайринг/внедрение - через сеттер
//    @Autowired
//    public void setUserService(UserService userService) {
//
//        this.userService = userService;
//    }
}
