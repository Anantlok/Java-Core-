/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pyramid;

/**
 *
 * @author Anant
 */
public class Rectangle {
    public static void main(String[] args) {
        for (int row = 1; row <= 6; row++) {
            for (int col = 1; col <= 6; col++) {
                if(row==1 || row==6 || col==1 || col==6){
                    System.out.print("*");}
                else{
                    System.out.print(" ");}
            }
            System.out.println("");
        }
        
    }
}
