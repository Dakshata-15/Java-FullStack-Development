package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {
    @GetMapping("/name")
    public String sayName(){
        return "I'm Dakshata";
    }
    @GetMapping("/address")
    public String sayAddress(){
        return "I'm from Coimbatore";
    }
    @GetMapping("/favcolor")
    public String sayFavcolor(){
        return "My Favorite Color is Red";
    }
}
