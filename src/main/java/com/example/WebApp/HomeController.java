package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World!";
    }

    @RequestMapping("/Davi")
    public @ResponseBody String greetingDavi() {
        return "Hello, Davi! Say hello Davi";
    }

    @RequestMapping("/Hugo")
    public @ResponseBody String greetingHugo() {
        return "Hugos is my brother ! Say hello Hugo";
    }

    @RequestMapping("/hotfix")
    public @ResponseBody String greetingHotfix() {
        return "Hello, hotfix!";
    }

    @RequestMapping("/teste")
    public @ResponseBody String greetingTeste() {
        return "Hello, teste_container!";
    }
}
