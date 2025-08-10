/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pyramid;

/**
 *
 * @author Anant
 */
public class HalfDiamond {
    public static void main(String[] args) {
        int n=5;
        int b=1;
        for (int i =1; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i =n-2; i > 0; i--) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
}
}
