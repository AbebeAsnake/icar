package com.abebe.icar;

public class Vehicle implements ICar {

    private String vehicleType;


    public Vehicle(){
System.out.println("The Vehcle constructor has run");
    }
public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
}
public String getVehicleType(){
        return  vehicleType;
}
    public String start(String s){

        return  s;
    }
    public String stop(String sto){
        return  sto;
    }
    public String going(String go){
        return  go;
    }
    public String accelerate(String a){
        return a;
    }
}
