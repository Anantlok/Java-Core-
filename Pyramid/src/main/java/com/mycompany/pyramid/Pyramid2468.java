/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pyramid;

/**
 *
 * @author Anant
 */
public class Pyramid2468 {
    public static void main(String[] args) {
        int n=6;
        int num=2;
        for (int i =1; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++){
                
                System.out.print(num+" ");
                num=num+2;
                if (num>8){
                num=2;}
            }
            System.out.println("");
        }
    }
}


