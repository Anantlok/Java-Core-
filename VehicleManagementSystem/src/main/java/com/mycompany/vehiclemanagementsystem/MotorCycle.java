/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclemanagementsystem;

/**
 *
 * @author Anant
 */
public class MotorCycle extends Vehicle{
    protected boolean HasSideCar;

    public MotorCycle(boolean HasSideCar, String model, int speed, double fuelCapacity) {
        super(model, speed, fuelCapacity);
        this.HasSideCar = HasSideCar;
    }

    public boolean isHasSideCar() {
        return HasSideCar;
    }
    @Override
    public void start(){System.out.println("MotorCycle Started with A Vroom");}
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Has Side Car: "+ isHasSideCar());}
    
}
