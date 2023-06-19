package com.example.springlearn;

import com.example.springlearn.service.UserService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

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

    private final ApplicationContext context;


    // 3 вариант инжекта/автовайринг/внедрение - через конструктор
    public SpringLearnApplication(UserService userService, ApplicationContext context) {

        this.context = context;

        this.userService = userService;
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringLearnApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {

//        this.context.getBean(UserService.class);

        userService.getUserById(1L);
    }

// 2 вариант инжекта/автовайринг/внедрение - через сеттер
//    @Autowired
//    public void setUserService(UserService userService) {
//
//        this.userService = userService;
//    }
}
