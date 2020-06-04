package com.learn.springstart.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun home(model: Model):String{
        return "home"
    }

    @GetMapping("/greeting")
    fun blog(model:Model):String{
        model.addAttribute("name","Imanuel Ronaldo")
        return "greeting"
    }

    @GetMapping("/login")
    fun login(model:Model):String{
        return "login"
    }
}