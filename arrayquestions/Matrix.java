/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayquestions;

/**
 *
 * @author Anant
 */
public class Matrix {
        public int[][] array={{3,4,5},{7,4,6},{6,7,8}};

    public Matrix() {
        matrix();
    }
    public void matrix(){
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                System.out.print(" "+array[row][col]+" {"+row+" ,"+col+"}");
                }
                System.out.println("");
            }
}
}
