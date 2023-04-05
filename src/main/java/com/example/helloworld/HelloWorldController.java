package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String today() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter display = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String todayDisplay = today.format(display);
        LocalDate newDay = today.plusDays(120);
        String newDayDisplay = newDay.format(display);
        return String.format("Hello world!今日は%s、120日後は%s", todayDisplay, newDayDisplay);
    }
}
