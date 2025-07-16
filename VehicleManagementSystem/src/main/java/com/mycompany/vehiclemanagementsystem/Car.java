/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclemanagementsystem;

/**
 *
 * @author Anant
 */
public class Car extends Vehicle{
    protected int numOfDoors;
    public Car(int numOfDoors, String model, int speed, double fuelCapacity) {
        super(model, speed, fuelCapacity);
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }
    
    public void start(){System.out.println("car started with a roar");}
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors: "+getNumOfDoors());
    }
    
}
