/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclemanagementsystem;

/**
 *
 * @author Anant
 */
public class Truck extends Vehicle{
    protected double loadCapacity;
    public Truck(double loadCapacity, String model, int speed, double fuelCapacity) {
        super(model, speed, fuelCapacity);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    public void start(){System.out.println("truck started with a loud engine");}
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity: "+ getLoadCapacity());}
    
    
}
