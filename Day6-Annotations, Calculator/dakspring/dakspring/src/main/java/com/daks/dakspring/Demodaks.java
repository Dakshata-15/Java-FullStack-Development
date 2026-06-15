package com.daks.dakspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class Demodaks {

    @GetMapping("/calc/add/{a}/{b}")
    public String add(@PathVariable int a,@PathVariable int b){
        int res = a+b;
        if(res%2==0){
            return "Sum : Even" ;
        }
        else{
            return "Sum : Odd" ;
        }

    }
    @GetMapping("/calc/diff/{a}/{b}")
    public String diff(@PathVariable int a,@PathVariable int b){
        int res = a-b;
        return "The Difference of "+a+ " and "+b+": " +res;
    }
    @GetMapping("/calc/mul/{a}/{b}")
    public String mul(@PathVariable int a,@PathVariable int b){
        int res = a*b;
        return "The Product of "+a+ " and "+b+": " +res;
    }
    @GetMapping("/calc/div/{a}/{b}")
    public String div(@PathVariable int a,@PathVariable int b){
        int res = a/b;
        return "The Quotient of "+a+ " and "+b+": " +res;
    }
    @GetMapping("/name/{name}")
    public String name(@PathVariable String name){
        String n =name.toLowerCase();
        if(n.equals("dakshata")){
            return "It's my Name";
        }
        else{
            return "I dont know";
        }
    }
    @GetMapping ("/climate/{deg}")
    public String climate(@PathVariable int deg){
        if(deg<=0){
            return "Shivering";
        } else if (deg>0 && deg<=15) {
            return "Chill";
        }
        else if (deg>15 && deg<=24) {
            return "Happy";
        }
        else if (deg>24 && deg<=30) {
            return "Towards Hot";
        }
        else if (deg>30 && deg<=32) {
            return "HOTTER";
        }else{
            return "OMG";
        }
    }
    @GetMapping("/myhtml")
    @ResponseBody
    public String sayHello(){
        return "<h1> daks ma </h1>";
    }

}
