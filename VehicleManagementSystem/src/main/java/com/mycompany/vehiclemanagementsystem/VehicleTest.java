/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclemanagementsystem;

/**
 *
 * @author Anant
 */
public class VehicleTest {
     public static void main(String[] args) {
        Vehicle[] v={ 
            new Car(5, "BMW M5", 240, 68),
            new MotorCycle(false, "Himalyan", 160, 15),
            new Truck(600, "Mercedes G", 150, 200),
     };
         for (int i = 0; i < v.length; i++) {
             v[i].start();
             v[i].displayInfo();
             System.out.println("");
         }
    }
}
