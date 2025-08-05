/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author Anant
 */
public class Test {
    int[] array;
    
    public Test() {
        array = new int[5];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
    }
    
    public void printarray(){
        for (int i = 0; i < array.length ; i++)
            System.out.print(" "+array[i]+" ");}
    
}
