/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pyramid;

/**
 *
 * @author Anant
 */
public class PyramidNumeric {
    public static void main(String[] args) {
        int value=0;
        for (int i = 0; i < 10; i++) {
           
            for (int j = 0; j < i; j++) {
                value+=1;
                System.out.print(value+" ");
            }
            System.out.println(" ");
        }
    }
}
