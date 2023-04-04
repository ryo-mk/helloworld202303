package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String today(){
        LocalDate  today = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String strToday = today.format(dtf);
        LocalDate newDay = today.plusDays(120);
        String strNewDay = newDay.format(dtf);
        return String.format("Hello world!今日は%s、120日後は%s",strToday,strNewDay);
    }
    }
