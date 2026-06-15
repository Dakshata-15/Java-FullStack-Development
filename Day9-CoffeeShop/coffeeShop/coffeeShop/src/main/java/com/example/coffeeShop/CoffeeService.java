package com.example.coffeeShop;

import com.example.coffeeShop.Coffee;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class CoffeeService {
    private final List<Coffee> orders= new ArrayList<>();
    public Coffee orderCoffee(Coffee coffee){
        orders.add(coffee);
        return coffee;
    }
    public List<Coffee> getOrders(){
        return orders;
    }
}