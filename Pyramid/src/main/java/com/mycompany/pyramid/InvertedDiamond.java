/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pyramid;

/**
 *
 * @author Anant
 */
public class InvertedDiamond {
    public static void main(String[] args) {
    int n=5;    
    
    for (int rows =n-1; rows > 0; rows--) {
            for (int j = 1; j <n-rows ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < rows*2; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    for (int i =2; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i*2; k++){
                System.out.print("*");
            }
            System.out.println("");
        }   
}
}
