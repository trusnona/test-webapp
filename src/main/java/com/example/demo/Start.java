package com.example.demo;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
class Start{
    
}

@RestController
class Demo{
    @RequestMapping("/test")
    int test(){
        return 555;
    }
    
    @RequestMapping("/status")
    String showStatus(){
        return "Server is OK";
        
    }
    
    @RequestMapping("/total")
    double showTotal(double price){
        return 107.0/100.0 * price;
        
    }
    
    @RequestMapping("/book")
    Book showBook(){
    Book b = new Book();
    b.title = "Biology";
    b.price = 150;
    return b;
    }
    
    
}
class Book{
    public String title;
    public double price;
}