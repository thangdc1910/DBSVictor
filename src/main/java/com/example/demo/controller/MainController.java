package com.example.demo.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by thangdo on 3/13/2019.
 */

@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}
