package com.daks.dakspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/intro/{name}/{city}/{course}")
    public String intro(@PathVariable String name,
                        @PathVariable String city,
                        @PathVariable String course){
        return "<h1><font color= red><u>Hello, I am "+name+", from "+city+", welcome to "+course +"</u></font></h1>" +
               " <p><h3> Flowers are one of the most beautiful creations of nature, coming in a wide variety of colors, shapes, and sizes, from delicate daisies to majestic roses. They bloom in gardens, fields, and forests, filling the air with their sweet fragrance and attracting bees, butterflies, and other pollinators that help plants reproduce. Beyond their aesthetic appeal, flowers hold symbolic meanings, representing love, friendship, purity, and hope. They are used in decorations, gifts, and cultural rituals, connecting humans to the natural world. Flowers not only brighten our days but also play a crucial role in maintaining ecological balance, supporting biodiversity, and enhancing the environment with their presence, making them an essential and cherished part of life</h3></p>"+
                "<img src='https://th.bing.com/th/id/R.fae070db362511a72c914ff8d0dc009d?rik=JFgJHnitIHX3FA&riu=http%3a%2f%2fgetwallpapers.com%2fwallpaper%2ffull%2f5%2ff%2fb%2f967407-gorgerous-beautiful-flowers-wallpaper-1920x1080-ipad-pro.jpg&ehk=Dxcbv993R7kUfO2COh0m3zvF61YjdoRK8aVTqQGRp1Q%3d&risl=&pid=ImgRaw&r=0' width=700 >"+
                "<img src='/red%20roses.jpg' width=700 height=400>";
    }
}

