package com.example.springMvcJte2.greeting.controller.query;

import com.example.springMvcJte2.greeting.entity.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greeting")
public class GreetingQueryController {

    @PostMapping("/result")
    public String handleForm(
            @ModelAttribute Greeting greeting, Model model
    ) {
        model.addAttribute("greeting", greeting);
        return "greeting/result/result";
    }

}

