package com.parking.rest;

import com.parking.model.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController

public class restController {
    @GetMapping("/start")
    public String methodStart(){
       return "START";
    }
    @GetMapping("/car")
    public Car methodCar(){
        Car newCar = new Car(1L,"ford", "7564-1", "Alex", 1, LocalDate.of(2022,1,22));
        return newCar;
    }

}
