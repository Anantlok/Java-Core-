/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclemanagementsystem;

/**
 *
 * @author Anant
 */
public class Vehicle {
    protected String model;
    protected int speed;
    protected double fuelCapacity;

    public Vehicle(String model, int speed, double fuelCapacity) {
        this.model = model;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    public void start(){System.out.println("Vehicle Started");}
    
    public void stop(){System.out.println("Vehicle Stopped");}
    
    public void displayInfo(){
        System.out.println("Model: "+getModel());
        System.out.println("Speed: "+getSpeed());
        System.out.println("Fuel Capacity: "+getFuelCapacity());}
}
