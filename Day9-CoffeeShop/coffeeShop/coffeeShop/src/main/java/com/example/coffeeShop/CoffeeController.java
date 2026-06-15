package com.example.coffeeShop;

import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/coffee")
public class CoffeeController {
    private final com.example.coffeeShop.CoffeeService service;
    public CoffeeController(com.example.coffeeShop.CoffeeService service){
        this.service=service;
    }
    @PostMapping
    public Coffee orderCoffee(@RequestBody Coffee coffee){
        return service.orderCoffee(coffee);
    }
    @GetMapping
    public List <Coffee> getOrders(){
        return service.getOrders();
    }
}