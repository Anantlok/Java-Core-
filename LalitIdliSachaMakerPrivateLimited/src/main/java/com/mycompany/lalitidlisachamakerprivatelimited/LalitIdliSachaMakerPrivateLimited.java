/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lalitidlisachamakerprivatelimited;

/**
 *
 * @author Anant
 */
public class LalitIdliSachaMakerPrivateLimited {
    public static void main(String[] args) {
    
        Validation v = new Validation();
        
        Operation op = new Operation(12, 12, 9, 5, 5, 6);
        boolean validateTrayCount=v.validateTrayCount(op);
        boolean validateRackTrackRadius=v.validateRackTrackRadius(op);
        boolean validateTrayDeepArea=v.validateTrayDeepArea(op);
        String ReturnTraySize=v.validateWhichTrayUse(op);
        
        System.out.println(ReturnTraySize);
        System.out.println(validateRackTrackRadius);
        System.out.println(validateTrayCount);
        System.out.println(validateTrayDeepArea);
        System.out.println(" ");
        
        
        if(validateTrayCount && validateRackTrackRadius && validateTrayDeepArea){
            System.out.println("Tray Size Picked: "+ReturnTraySize);
            Estimation.printEstimation(op);
        }
    }
}


