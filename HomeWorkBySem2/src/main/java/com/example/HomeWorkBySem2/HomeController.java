package com.example.HomeWorkBySem2;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
   @GetMapping("/")
    public String home(Model model) {
       model.addAttribute("message", "Добро пожаловать! Geek brains");
       return "index";
   }

}
