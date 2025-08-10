/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pyramid;

/**
 *
 * @author Anant
 */
public class Plus {
    public static void main(String[] args) {
        for (int i =1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i==3 || j==3 ){System.out.print("*");}
                else{System.out.print(" ");}
            }
            System.out.println("");
        }
}
}

