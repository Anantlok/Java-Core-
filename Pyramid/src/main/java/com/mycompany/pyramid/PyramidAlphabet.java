/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pyramid;

/**
 *
 * @author Anant
 */
public class PyramidAlphabet {
        public static void main(String[] args) {
        char value='a';
        for (int i = 1; i < 10; i++) {

            for (int j = 0; j < i; j++) {
                
                System.out.print(value+" ");
                value+=1;
            }
            System.out.println(" ");
        }
    }
}
