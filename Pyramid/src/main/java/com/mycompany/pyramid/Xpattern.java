/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pyramid;

/**
 *
 * @author Anant
 */
public class Xpattern {
     public static void main(String[] args) {
        int n=5;
        int b=1;
        for (int i =1; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i*2; k++){
                { System.out.print("*");}
                
            }
            System.out.println("");
        }   
}
}
