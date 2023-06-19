package com.example.springlearn.controller;

import com.example.springlearn.model.User;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @GetMapping("/test")
//    @ResponseBody
    public ModelAndView findAll1() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        mv.getModel().put("name", "Amir");

        return mv;
    }

    @RequestMapping(value = "/index")
    public String index() {

        return "index";
    }




}
