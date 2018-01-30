package com.abebe.icar;

public class Car extends Vehicle{
    private String carType;
    private String carColor;

public void setCarType(String carType){

    this.carType = carType;
}
public String getCarType(){
    return carType;
}
public void setCarColor(String carColor){
    this.carColor = carColor;
}
public String getCarColor(){
    return carColor;
}
}