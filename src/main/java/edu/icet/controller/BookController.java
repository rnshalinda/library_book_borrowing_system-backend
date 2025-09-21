package edu.icet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("BookController")
public class BookController {

    @GetMapping("book")
    public String getBook(){
        return "Madol Duwa";
    }
}
