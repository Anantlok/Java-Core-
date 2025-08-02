/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayquestions;

/**
 *
 * @author Anant
 */
public class Question10 { 

    public Question10() {
        System.out.print("q10 ");
        matrixmultiplication();
    }
    
    int arr1[][]={{1,2},{3,4}};
    int arr2[][]={{5,6},{0,7}};
    public void matrixmultiplication(){
        int row=arr1.length;
        int col=arr2[0].length;
        int common=arr1[0].length;
        int arr3[][]=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < common; k++) {
                arr3[i][j]= arr1[i][k]*arr2[i][k];
            }}}
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
            System.out.print(arr3[i][j]+ " ");
            }
            System.out.println();
        }
        
        
    }
}

