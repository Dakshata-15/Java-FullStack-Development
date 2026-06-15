package com.example.coffeeOrder;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CoffeeService {
    private final List<String> orders = new ArrayList<>();

    //Business logic: add a coffee order
    public String orderCoffee(String type){
        orders.add(type);
        return "Order placed for: "+type;
    }

    //Business logic: list all
    public List<String> getOrders(){
        return orders;
    }
}
