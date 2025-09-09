package com.example.springMvcJte2.greeting.controller.query;

import com.example.springMvcJte2.greeting.entity.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"", "/","/greeting"})
public class GreetingViewController {

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting/form/form";
    }

}

