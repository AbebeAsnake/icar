package com.abebe.icar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CarApp {
    Car Porsche = new Car();
    Car Jetta = new Car();
    Vehicle car = new Vehicle();

        ArrayList<Vehicle> myVehicles = new ArrayList<Vehicle>();

@RequestMapping("/")
    public String myCar(){
         car.setVehicleType("car");
         Porsche.setCarColor("red");
         Porsche.setCarType("Porsche");
         Jetta.setCarColor("blue");
         Jetta.setCarType("Jetta");
         Porsche.setVehicleType("Car");
         myVehicles.add(Porsche);
         myVehicles.add(Jetta);
         System.out.println(Porsche.getCarColor()+Porsche.getCarType() +Porsche.start(" is starting"));
    System.out.println(Porsche.getCarColor()+Porsche.accelerate(""));
    System.out.println(Porsche.getCarColor()+Porsche.going(""));
    System.out.println(Porsche.getCarColor()+Porsche.stop(""));
return "abb";
    }
}
